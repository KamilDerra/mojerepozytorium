package com.sdkjava.application.repository;

/* Pakiet Repository: 
  
   - zawiera klasy odpowiedzialne za dostęp do danych (m.in. z bazy danych)
   - klasy te implementują operacje CRUD na modelach, mogą wykorzystywać biblioteki ORM do uproszczenia dostępu do bazy danych.

*/


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sdkjava.application.wallet.*;


@Repository  // Repo for SpringData JPA
public interface WalletRepository extends CrudRepository<Wallet, Long> {
	
	Optional<Wallet> findById(Long id);
	
	//@SuppressWarnings("unchecked")
	Wallet save(Wallet wallet);
	
	List<Wallet> findAll();

}
