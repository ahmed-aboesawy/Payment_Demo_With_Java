package com.payment.demo.business;

import com.payment.demo.models.Product;

public record ProductDto (Product product, int quantity) {
}
