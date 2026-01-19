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

class BabyCat extends Cat{
    void BabyCatmeow() {
        System.out.println("BabyCat meow...");
    }
}
// multilevel inheritance
public class MultilevelInheritance {
    public static void main(String args[]) {
        BabyCat c = new BabyCat();
        c.eat();
        c.meow();
        c.BabyCatmeow();
    }
}
