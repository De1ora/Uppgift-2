package uppgift;

public class Main {
    public static void main(String[] args) {
        
        Cat cat = new Cat(); // Exempel på inheritance, eftersom att Cat extends Animals så kan vi använda funktionen makeSound
        cat.makeSound();

        Dog dog = new Dog(); // Exempel på polymorphism, se Dog.java
        dog.makeSound();
    }
}
