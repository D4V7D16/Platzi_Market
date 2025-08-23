package com.platzi.market.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Purchase {
    private int purchaseId;
    private int clientId;
    private LocalDateTime purchaseDate;
    private String paymentMethod;
    private String comment;
    private String state;

    private List<PurchaseItem> Items;
}
