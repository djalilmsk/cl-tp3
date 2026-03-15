package smartlibrary;

/**
 * Concrete decorator that adds book protection to a loan.
 *
 * Decorators allow services to be combined dynamically at runtime:
 * for example, a basic loan can be wrapped by protection, then by delivery.
 */
public class ProtectionDecorator extends LoanDecorator {

    private static final double PROTECTION_COST = 0.5;

    public ProtectionDecorator(Loan loan) {
        super(loan);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + PROTECTION_COST;
    }
}
