package assignment8;

public class ErrorHandling {
    public void run() throws Exception1,Exception2,Exception3{
        System.out.println("run method called");
        throw new Exception1();
//        throw new Exception2();
//        throw new Exception3();
//        throw new NullPointerException();
    }
}
