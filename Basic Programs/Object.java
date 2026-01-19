class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
    }
}
public class Object {
    public static void main(String args[]){
        Person p = new Person("Tejas",20);
        p.display();
    }
    
}
