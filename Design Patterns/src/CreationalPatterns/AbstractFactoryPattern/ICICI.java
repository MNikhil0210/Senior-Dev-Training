package CreationalPatterns.AbstractFactoryPattern;

public class ICICI implements Bank {
    private final String name;
    public ICICI(){
        name = "ICICI BANK";
    }
    @Override
    public String getBankName() {
        return name;
    }
}
