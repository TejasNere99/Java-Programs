class Animal {
    public Animal() {
        System.out.println("Animal constructor is called..");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Cat extends Animal {
    public Cat() {
        System.out.println("Cat constructor is called..");
    }

    void meow() {
        System.out.println("Cat meow...");
    }
}
// single inheritance
public class SingleInheritance {
    public static void main(String args[]) {
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
