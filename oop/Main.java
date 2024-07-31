class Animal{
    public void animalSound(){
        System.out.println("Animal makes a sound!");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("Woof Woof!");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("Oink! Oink!");
    }
}

class Main{
    public static void main(String[] args){
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myPig = new Pig();

        myAnimal.animalSound();
        myDog.animalSound();
        myPig.animalSound();
    }
}