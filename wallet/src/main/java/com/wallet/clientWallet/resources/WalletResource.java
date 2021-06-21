/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wallet.clientWallet.resources;

import com.wallet.clientWallet.models.Wallet;
import com.wallet.clientWallet.services.WalletService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wolivdel
 */
@RestController
@RequestMapping(value = "/wallets")
public class WalletResource {

    @Autowired
    WalletService walletService;

    @GetMapping
    public List<Wallet> findAllWallets() {
        return walletService.findAll();
    }
    
    @GetMapping("{userId}")
    public Wallet findUserWallet(@PathVariable(value="userId")long userId) {
        return walletService.findUserWallet(userId);
    }
    
    
}
