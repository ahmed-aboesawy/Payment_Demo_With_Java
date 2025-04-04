package com.payment.demo.business;

import com.payment.demo.models.Product;
import com.payment.demo.service.ShoppingService;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements ShoppingService {

    private List<ProductDto> products = new ArrayList(10);

    @Override
    public void addProduct(Product product, int quantity) {
        if (product.getQuantity() < quantity)
            throw new IndexOutOfBoundsException("this quantity isn't available.");

        products.add(new ProductDto(product, quantity));
    }

    public double subtotal(){
        return this.products.stream()
                .mapToDouble(dto -> dto.quantity() * dto.product().getPrice())
                .sum();
    }

    public void viewProducts(){
        this.products.forEach(productDto -> System.out.println(productDto.quantity() + " x " + productDto.product().getName()));
    }

    public int currentSize(){
        return products.size();
    }
}
