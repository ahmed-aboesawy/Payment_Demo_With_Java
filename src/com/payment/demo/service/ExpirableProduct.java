package com.payment.demo.service;

import com.payment.demo.models.Product;

import java.time.LocalDate;

public record ExpirableProduct(Product product, LocalDate expireDate) implements ExpirableService{

    @Override
    public boolean isExpired() {
        return expireDate.isBefore(LocalDate.now());
    }
}
