package com.ecommerce.orders;

import com.ecommerce.exceptions.InvalidOrderException;

public class OnlineOrder extends Order implements Discountable, Taxable {

    private double shippingFee;

    public OnlineOrder(int orderId, double amount, double shippingFee) throws InvalidOrderException {
        super(orderId, amount); // constructor chaining
        this.shippingFee = shippingFee;
    }

    @Override
    public double applyDiscount(double amount) {
        // 10% discount
        return amount * 0.9;
    }

    @Override
    public double calculateTax(double amount) {
        // 5% online tax
        return amount * 0.05;
    }

    @Override
    public double calculateTotal() {
        double discounted = applyDiscount(amount);
        double tax = calculateTax(discounted);
        return discounted + tax + shippingFee;
    }

    @Override
    public String toString() {
        return "OnlineOrder: " + super.toString() + ", Shipping Fee: " + shippingFee + ", Total: " + calculateTotal();
    }
}