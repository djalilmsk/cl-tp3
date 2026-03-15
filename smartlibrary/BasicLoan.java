package smartlibrary;

/**
 * Concrete component.
 * Represents the basic loan with the default cost of 1 euro.
 */
public class BasicLoan implements Loan {

    private static final double BASE_COST = 1.0;

    @Override
    public double calculateCost() {
        return BASE_COST;
    }
}
