package com.payment.demo.util;

import com.payment.demo.models.Product;
import com.payment.demo.service.ExpirableProduct;
import com.payment.demo.service.ShippingProduct;

import java.time.LocalDate;

public enum ProductMapper {
    ;
    public static ShippingProduct convertToShippingProduct(Product product, int weight){
        return new ShippingProduct(product.getName(), weight);
    }

    public static ExpirableProduct convertToExpireProduct(Product product, LocalDate date){
        return new ExpirableProduct(product, date);
    }
}
