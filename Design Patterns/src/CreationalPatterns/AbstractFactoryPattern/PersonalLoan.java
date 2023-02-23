package CreationalPatterns.AbstractFactoryPattern;

public class PersonalLoan extends Loan {
    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}
