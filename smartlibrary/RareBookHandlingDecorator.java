package smartlibrary;

/**
 * New concrete decorator added without modifying existing classes.
 *
 * This is exactly why the Decorator pattern is useful:
 * new optional services can be introduced by adding new decorators only.
 */
public class RareBookHandlingDecorator extends LoanDecorator {

    private static final double RARE_BOOK_HANDLING_COST = 3.0;

    public RareBookHandlingDecorator(Loan loan) {
        super(loan);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + RARE_BOOK_HANDLING_COST;
    }
}
