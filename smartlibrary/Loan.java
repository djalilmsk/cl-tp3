package smartlibrary;

/**
 * Component interface of the Decorator pattern.
 * Every type of loan must be able to calculate its total cost.
 */
public interface Loan {
    double calculateCost();
}
