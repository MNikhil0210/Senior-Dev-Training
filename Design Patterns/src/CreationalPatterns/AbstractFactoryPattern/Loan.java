package CreationalPatterns.AbstractFactoryPattern;

public abstract class Loan {
    protected double rate;
    abstract void getInterestRate(double rate);
    public void calculateLoanPayment(double loanAmount, int years) {
        double EMI;
        int months;
        months = years * 12;
        rate = rate / 1200;
        EMI = ((rate * Math.pow((1 + rate), months)) / ((Math.pow((1 + rate), months)) - 1)) * loanAmount;
        System.out.println("your monthly EMI is " + EMI + " for the amount " + loanAmount + " you have borrowed");
    }
}
