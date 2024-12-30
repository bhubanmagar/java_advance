// class Demo {
//     public static void main(String[] args ){
//         System.out.println("hello world");
//     }
// }
import java.util.Scanner;


//program to add two number
class Demo1{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = sn.nextInt();
        System.out.println("Enter second number");
        int y = sn.nextInt();
        int sum  = x+ y;
        System.out.println("Sum of" +x+  "and" +y+ " is :"+sum);
        sn.close();
    }
}