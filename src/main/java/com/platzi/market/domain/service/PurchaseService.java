package com.platzi.market.domain.service;

import com.platzi.market.domain.Purchase;
import com.platzi.market.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    PurchaseRepository purchaseRepository;

    public List<Purchase> getAllPurchases(){
        return purchaseRepository.getAllPurchases();
    }

    public Optional<List<Purchase>> getAllPurchasesByUser(String clienteId){
            return purchaseRepository.getAllPurchasesByUser(clienteId);
    }

    public Purchase savePurchase(Purchase purchase){
        return purchaseRepository.savePurchase(purchase);
    }

}
