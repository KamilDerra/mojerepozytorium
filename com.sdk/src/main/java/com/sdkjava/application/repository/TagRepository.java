package com.sdkjava.application.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sdkjava.application.wallet.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {
	
	
	Optional<Tag> findById(Long id);
	
	//@SuppressWarnings("unchecked")
	Tag save(Tag tag);
	
	List<Tag> findAll();
	
	List<Tag> findByName(String name);

}
