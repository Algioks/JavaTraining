package OOP;

class Person {

    String name;
    String email;
    String phone;

    void walk() {
        System.out.println(name + " is walking");
    }

    void eat() {
        System.out.println(email);
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }

}

public class Main {

    public static void main(String[] args) {
        //Instantiating an object
        Person person1 = new Person();

        //Define some properties
        person1.name = "Joe";
        person1.email = "Joe@gmail.com";
        person1.phone = "65618135185";

        //abstraction
        person1.walk();
        person1.sleep();
        person1.eat();
    }
}
