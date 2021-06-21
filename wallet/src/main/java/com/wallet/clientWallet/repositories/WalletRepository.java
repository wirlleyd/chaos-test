/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wallet.clientWallet.repositories;

import com.wallet.clientWallet.models.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author wolivdel
 */
public interface WalletRepository extends JpaRepository<Wallet, Long>{
    public Wallet findByUserId(long user_id);
}
