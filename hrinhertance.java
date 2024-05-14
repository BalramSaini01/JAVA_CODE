
// Superclass
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Subclass 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Subclass 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}

public class hrinhertance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal class
        dog.bark(); // Defined in Dog class
        
        Cat cat = new Cat();
        cat.eat();  // Inherited from Animal class
        cat.meow(); // Defined in Cat class
    }
}
