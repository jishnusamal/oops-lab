package com.ecommerce.orders;
import com.ecommerce.exceptions.InvalidOrderException;

public abstract class Order {
    protected int orderId;
    protected double amount;

    public Order(int orderId, double amount) throws InvalidOrderException {
        if (amount < 0) {
            throw new InvalidOrderException("Order amount cannot be negative.");
        }
        this.orderId = orderId;
        this.amount = amount;
    }

    // Method to be overridden
    public abstract double calculateTotal();

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Amount: " + amount;
    }
}