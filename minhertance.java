// Interface 1
interface Flyable {
    void fly();
}

// Interface 2
interface Swimmable {
    void swim();
}

// Class implementing multiple interfaces
class Bird implements Flyable, Swimmable {
    
    public void fly() {
        System.out.println("Bird is flying.");
    }

    
    public void swim() {
        System.out.println("Bird is swimming.");
    }
}

public class minhertance {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.swim();
    }
}
