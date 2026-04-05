package com.ecommerce.orders;

import com.ecommerce.exceptions.InvalidOrderException;

public class InStoreOrder extends Order implements Discountable, Taxable {

    private boolean isPremiumCustomer;

    public InStoreOrder(int orderId, double amount, boolean isPremiumCustomer) throws InvalidOrderException {
        super(orderId, amount); // constructor chaining
        this.isPremiumCustomer = isPremiumCustomer;
    }

    @Override
    public double applyDiscount(double amount) {
        // 15% discount for premium, 5% otherwise
        return amount * (isPremiumCustomer ? 0.85 : 0.95);
    }

    @Override
    public double calculateTax(double amount) {
        // 8% in-store tax
        return amount * 0.08;
    }

    @Override
    public double calculateTotal() {
        double discounted = applyDiscount(amount);
        double tax = calculateTax(discounted);
        return discounted + tax;
    }

    @Override
    public String toString() {
        return "InStoreOrder: " + super.toString() + ", Premium: " + isPremiumCustomer + ", Total: " + calculateTotal();
    }
}