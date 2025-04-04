package com.payment.demo;

import com.payment.demo.business.CreditCard;
import com.payment.demo.business.ShoppingCart;
import com.payment.demo.models.Customer;
import com.payment.demo.models.Product;
import com.payment.demo.service.ShippingProduct;
import com.payment.demo.util.ProductMapper;
import com.payment.demo.util.ShoppingProcessService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

    static List<ShippingProduct> shippingProducts = new ArrayList<>();

    public static void main(String... a){
        Product TV = new Product("Sa Z22", 10000.0, 4);
        Product mobile = new Product("DcY-96", 7500.0, 2);

        Product scratchCard = new Product("Hw33", 30.0, 3);

        Product cheese = new Product("Old Cheese", 100.30, 50);
        Product biscuits = new Product("Biscuits", 20.0, 200);

        shippingProducts.add(ProductMapper.convertToShippingProduct(mobile, 400));
        shippingProducts.add(ProductMapper.convertToShippingProduct(TV, 4000));





        ShoppingCart cart = new ShoppingCart();


        cart.addProduct(cheese, 4);
        cart.addProduct(biscuits, 7);


        System.out.println(cart.currentSize());

        ShoppingProcessService.checkExpire(
                ProductMapper.convertToExpireProduct(
                        cheese, LocalDate.of(2025,2,4))
                );


        ShoppingProcessService
                .checkout(
                        new Customer("CName", "Ct12 - 45gt",
                                new CreditCard(250)),
                        cart);
        cart.viewProducts();

    }


}
