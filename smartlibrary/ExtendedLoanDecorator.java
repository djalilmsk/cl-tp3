package smartlibrary;

/**
 * Concrete decorator that adds the extended loan service.
 */
public class ExtendedLoanDecorator extends LoanDecorator {

    private static final double EXTENDED_LOAN_COST = 1.0;

    public ExtendedLoanDecorator(Loan loan) {
        super(loan);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + EXTENDED_LOAN_COST;
    }
}
