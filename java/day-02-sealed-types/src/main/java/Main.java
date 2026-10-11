
sealed interface Payment permits CreditCardPayment, WalletPayment, CashPayment {}

record CreditCardPayment(String last4) implements Payment {}
record WalletPayment(String provider, long balanceCents) implements Payment {}
record CashPayment() implements Payment {}

public class Main {
    
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment("1234");
        Payment payment2 = new WalletPayment("PayPal", 5000);
        Payment payment3 = new CashPayment();

        System.out.println(payment1);
        System.out.println(payment2);
        System.out.println(payment3);
        System.out.println(describePayment(payment1));
        System.out.println(describePayment(payment2));
        System.out.println(describePayment(payment3));
    }

    static String describePayment(Payment payment) {
        return switch (payment) {
            case CreditCardPayment ccp -> "Credit Card ending with " + ccp.last4();
            case WalletPayment wp -> "Wallet from " + wp.provider() + " with balance " + wp.balanceCents() + " cents";
            case CashPayment cp -> "Cash Payment";
        };
    }
}
