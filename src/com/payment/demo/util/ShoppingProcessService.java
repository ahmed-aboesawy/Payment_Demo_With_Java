package com.payment.demo.util;

import com.payment.demo.business.ShoppingCart;
import com.payment.demo.models.Customer;
import com.payment.demo.service.ExpirableProduct;

public interface ShoppingProcessService {

    static void checkout(Customer customer, ShoppingCart cart) {
        double customerBalance = customer.getCard().getBalance();
        double cartCoast = cart.subtotal();
        if (cartCoast > customerBalance)
            throw new RuntimeException("Not Enough Money!!");
    }

    static void checkExpire(ExpirableProduct... products){
        for (ExpirableProduct expirableProduct: products){
            if (expirableProduct.isExpired())
                throw new RuntimeException("Worry " + expirableProduct.product().getName() + " is Expired!!");
        }
    }

}
