import java.io.*;
class Animal {
    public void animalSound() {
        System.out.println("An Animal can make a sound");
    }
}
class Cow extends Animal {
    public void animalSound() {
        System.out.println("A Cow says Maa");
    }
}
class Cat extends Animal {
    public void animalSound() {
        System.out.println("A Cat says Meo");
    }
}
public class PolymorphismDemo {
    public static void main(String args[]) {
        Animal myanimal = new Animal();
        Animal mycow = new Cow();
        Animal mycat = new Cat();
        myanimal.animalSound();
        mycow.animalSound();
        mycat.animalSound();
    }
}
