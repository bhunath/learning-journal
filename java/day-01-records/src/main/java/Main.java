import java.util.*;


// Created Money record with validation for currency and amount
record Money(String currency, double amount) {
    Money {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (currency == null || currency.isEmpty()) {
            throw new IllegalArgumentException("Currency cannot be null or empty");
        }
        if (!currency.matches("[A-Z]{3}")) {
            throw new IllegalArgumentException("Currency must be a 3-letter uppercase code");
        }
    }
}

record OrderLine(String sku, int quantity, Money unitPrice) {
    Money totalPrice() {
        return new Money(unitPrice.currency(), unitPrice.amount() * quantity);
    }
}

record Order(int id, List<OrderLine> orderLines) {
    Order {
        if (orderLines == null) {
            throw new IllegalArgumentException("Order lines cannot be null");
        }
        orderLines = List.copyOf(orderLines);
    }
}

public class Main {
    public static void main(String[] args) {
        // Testing Money record with valid and invalid inputs
        try {
            Money validMoney = new Money("USD", 100.0);
            System.out.println("Valid Money: " + validMoney);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        OrderLine orderLine = new OrderLine("SKU123", 2, new Money("USD", 50.0));
        System.out.println("OrderLine total price: " + orderLine.totalPrice());
    }   
}