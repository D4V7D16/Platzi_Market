package com.platzi.market.web.controller;

import com.platzi.market.domain.Purchase;
import com.platzi.market.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseControler {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/purchases")
    public ResponseEntity<List<Purchase>> getAllPurchases(){
        return new ResponseEntity<>(purchaseService.getAllPurchases(), HttpStatus.OK);
    }


    @GetMapping("/purchasesUser/{clientId}")
    public ResponseEntity<List<Purchase>> getAllPurchasesByUser(@PathVariable("clientId") String clientId){
        return purchaseService.getAllPurchasesByUser(clientId)
                .map(purchases -> (new ResponseEntity<>(purchases, HttpStatus.OK)))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/savePurchase")
    public ResponseEntity<Purchase> savePurchase(@RequestBody Purchase purchase){
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.OK);
    }

}
