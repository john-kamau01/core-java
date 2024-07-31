interface Animal{
    public void animalSound();
    public void sleep();
}

class Pig implements Animal{
    public void animalSound(){
        System.out.println("Oink Oink");
    }

    public void sleep(){
        System.out.println("Zzzzzz");
    }
}


public class InterfaceExample {
    public static void main(String[] args){
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
