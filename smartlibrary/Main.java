package smartlibrary;

/**
 * Demo class showing how services are dynamically combined by wrapping loans
 * with different decorators.
 */
public class Main {

    public static void main(String[] args) {
        Loan loan1 = new BasicLoan();
        Loan loan2 = new ProtectionDecorator(new BasicLoan());
        Loan loan3 = new DeliveryDecorator(new ProtectionDecorator(new BasicLoan()));
        Loan loan4 = new RareBookHandlingDecorator(
                new ExtendedLoanDecorator(
                        new DeliveryDecorator(
                                new BasicLoan())));

        System.out.println("Base loan: " + formatEuro(loan1.calculateCost()));
        System.out.println("Loan + Protection: " + formatEuro(loan2.calculateCost()));
        System.out.println("Loan + Protection + Delivery: " + formatEuro(loan3.calculateCost()));
        System.out.println("Loan + Delivery + Extended + Rare Book: " + formatEuro(loan4.calculateCost()));
    }

    private static String formatEuro(double amount) {
        if (amount == Math.floor(amount)) {
            return String.format("%.0f€", amount);
        }
        return String.format("%.1f€", amount);
    }
}
