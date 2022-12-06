package assignment8;

public class Assignment8 {
    public static void main(String[] args){
        ErrorHandling person = new ErrorHandling();
        try {
            person.run();
        } catch (Exception e) {
            System.out.println("inside exception block ,Exception= "+e.getClass());
        }
        finally {
            System.out.println("finally block called");
        }
    }
}
