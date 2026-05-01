abstract class PaymentMethod {
    abstract void validatePayment(double amount);
    abstract void processRefund(double amount);
}

interface Loggable {
    void log();
}

interface Notifiable {
    void notify_user();
}

class CreditCard extends PaymentMethod implements Loggable, Notifiable {
    String id = "XXXX 1234";

    @Override
    public void validatePayment(double amount) {
        System.out.println("Debited " + amount + " from Credit Card "+ id);
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Refunded " + amount + " to Credit Card "+ id);
    }

    @Override
    public void log() {
        System.out.println("Refunded " + amount + " to Credit Card "+ id);
        
    }

    @Override
    public void notify_user() {
        System.out.println("Refunded " + amount + " to Credit Card "+ id);
        
    }
    

    
}

class Paypal extends PaymentMethod {
    String id = "abc@gmail.com";

    @Override
    public void validatePayment(double amount) {
        System.out.println("Debited " + amount + " from Paypal "+ id);
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Refunded " + amount + " to Paypal "+ id);
    }
}

public class paymentMethodDemo {
    public static void main(String[] args) {
        
    }
    
}
