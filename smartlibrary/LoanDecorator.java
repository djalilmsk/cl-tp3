package smartlibrary;

/**
 * Abstract decorator.
 * It wraps another Loan object and delegates the calculation to it.
 *
 * This respects the Open/Closed Principle because new services can be added
 * by creating new decorators instead of changing existing classes.
 */
public abstract class LoanDecorator implements Loan {

    protected final Loan loan;

    public LoanDecorator(Loan loan) {
        this.loan = loan;
    }

    @Override
    public double calculateCost() {
        return loan.calculateCost();
    }
}
