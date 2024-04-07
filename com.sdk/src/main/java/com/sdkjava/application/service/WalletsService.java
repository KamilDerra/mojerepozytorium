package com.sdkjava.application.service;

import java.util.List;
import java.util.Optional;

import com.sdkjava.application.wallet.Wallet;


// CRUD

public interface WalletsService {
	
	public Optional<List<Wallet>> getWalletsBySearchCriteria(WalletsSearchCriteria criteria);
	
	public Wallet createWallet(Wallet wallet);
	
	public Optional<List<Wallet>> getAllWallets();
	
	public void deleteWallet(Long walletId);
	

}
