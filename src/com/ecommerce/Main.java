package com.ecommerce;

import com.ecommerce.orders.*;
import com.ecommerce.exceptions.InvalidOrderException;

public class Main {
    public static void main(String[] args) {
        Order[] orders = new Order[4];

        try {
            orders[0] = new OnlineOrder(101, 200, 20);
            orders[1] = new InStoreOrder(102, 150, true);
            orders[2] = new OnlineOrder(103, -50, 15); // will throw exception
            orders[3] = new InStoreOrder(104, 100, false);
        } catch (InvalidOrderException e) {
            System.out.println("Exception caught while creating orders: " + e.getMessage());
        }

        for (Order order : orders) {
            try {
                if (order != null) {
                    System.out.println(order.toString()); // runtime polymorphism
                }
            } catch (Exception e) {
                System.out.println("Error processing order: " + e.getMessage());
            } finally {
                // Simulate resource cleanup
                System.out.println("Processed order cleanup complete.\n");
            }
        }
    }
}