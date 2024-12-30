
 class animal{
    public void eat(){
        System.out.println("animal eats grass");
    }
}

  class dog extends animal{
    @Override
    public void eat(){
        System.out.println("dog eat meat");
    }
}



public class overrideDemo {
public static void main(String[] args) {
    dog d = new dog();
  
    d.eat();
}

}
