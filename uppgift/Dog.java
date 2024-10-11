package uppgift;

public class Dog extends Animal {
    String breed;
    double tailSize;

    // Eftersom att makeSound definieras i Animal som "Meow", så kommer även hunden att säga meow. Med polymorphism kan vi ändra
    // beteendet genom att overridea metoden. Det är fortfarande exakt samma metod, men implementationen/innehållet för hundar
    // specifikt har ändrats.
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
