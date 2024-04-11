package com.sdkjava.application.service;

/*  Pakiet Service:
  
     - zawiera klasy implementujące logikę biznesową aplikacji,
     - serwisy mogą wykorzystywać modele i repozytoria do wykonywania złożonych operacji. 
 
 */



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdkjava.application.repository.WalletRepository;
import com.sdkjava.application.wallet.Wallet;


@Service
public class WalletServiceImpl implements WalletsService{
	

	@Autowired
	private WalletRepository walletRepository;
	
	
	@Override
	public Optional<List<Wallet>> getWalletsBySearchCriteria(WalletsSearchCriteria criteria) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Wallet createWallet(Wallet wallet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Wallet>> getAllWallets() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void deleteWallet(Long walletId) {
		// TODO Auto-generated method stub
		
	}

}
