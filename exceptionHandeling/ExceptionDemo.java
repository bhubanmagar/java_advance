package exceptionHandeling;

public class ExceptionDemo {
    public static void main(String[] args)throws ArithmeticException {
        try {
            int a = 10/0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }finally{
            System.out.println("finally block executed");
        }
        
    }
    
}
