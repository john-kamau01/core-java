// Abstract Class
abstract class Animal{
    // Abstract method (no body)
    public abstract void animalSound();
    // Regular method
    public void sleep(){
        System.out.println("Zzzzz");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("Oink Oink!");
    }
}


public class AbstractExample {
    public static void main(String[] args){
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
