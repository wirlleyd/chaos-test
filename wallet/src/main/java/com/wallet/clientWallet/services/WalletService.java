/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wallet.clientWallet.services;

import com.wallet.clientWallet.models.Wallet;
import com.wallet.clientWallet.repositories.WalletRepository;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wolivdel
 */

@Service
public class WalletService {
    @Autowired
    WalletRepository walletRepository;
    
    public List<Wallet> findAll()  {
        return walletRepository.findAll();
    }
    
    public Wallet findUserWallet(long userId)  {
        return walletRepository.findByUserId(userId);
    }
}
