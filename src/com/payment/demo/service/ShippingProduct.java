package com.payment.demo.service;

public record ShippingProduct(String name, double weight)
        implements ShippingService {
}
