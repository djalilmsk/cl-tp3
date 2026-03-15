package smartlibrary;

/**
 * Concrete decorator that adds home delivery to a loan.
 */
public class DeliveryDecorator extends LoanDecorator {

    private static final double DELIVERY_COST = 2.0;

    public DeliveryDecorator(Loan loan) {
        super(loan);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + DELIVERY_COST;
    }
}
