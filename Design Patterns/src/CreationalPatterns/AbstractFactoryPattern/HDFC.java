package CreationalPatterns.AbstractFactoryPattern;

public class HDFC implements Bank{
    private final String name;
    public HDFC(){
        name = "HDFC BANK";
    }
    @Override
    public String getBankName() {
        return name;
    }
}
