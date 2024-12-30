package threads;

class thread1 extends Thread{
    public void run(){
        System.out.println("i am thread 1");
        System.out.println("i am thread 1");
        System.out.println("i am thread 1");
        System.out.println("i am thread 1");
        System.out.println("i am thread 1");
        System.out.println("i am thread 1");
        System.out.println("i am thread 1");
        System.out.println("i am thread 1");
        System.out.println("i am thread 1");
        System.out.println("i am thread 1");
        System.out.println("i am thread 1");
    }
}
class thread2 extends Thread{
    public void run(){
        System.out.println("i am thread 2");
        System.out.println("i am thread 2");
        System.out.println("i am thread 2");
        System.out.println("i am thread 2");
        System.out.println("i am thread 2");
        System.out.println("i am thread 2");
        System.out.println("i am thread 2");
        System.out.println("i am thread 2");
        System.out.println("i am thread 2");
        System.out.println("i am thread 2");
        System.out.println("i am thread 2");
    }
}



public class threadDemo {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}
