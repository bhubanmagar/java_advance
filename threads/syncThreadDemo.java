package threads;

import java.io.IOException;

class counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}


public class syncThreadDemo {
    public static void main(String[] args) throws IOException {
        counter c1 = new counter();
        Thread t1 = new Thread(new Runnable() {
            public void run(){
                for(int i=1; i<1000; i++){
                c1.increment();
            };
            };
        });


        Thread t2 = new Thread(new Runnable() {
            public void run(){
                for(int i=1; i<1000; i++){
                c1.increment();
            }
            };
        });
t1.start();
t2.start();

System.out.println("Count:"+ c1.count);


    }
    
}
