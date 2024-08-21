package oops.methodoverloading;

// Method Overloading is two or more methods can have the same name inside the same class if they accept different arguments.
// It is achieved by either: 1. changing the number if arguments 2. or changing the data type of the arguments.

public class Main {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greetings();
        Greet obj2 = new Greet();
        obj2.greetings("Rahul");
        Greet obj3 = new Greet();
        obj3.greetings(8);
    }
}

class Greet {
    void greetings() {
        System.out.println("Hello, Good Morning.");
    }
    void greetings(String name) {
        System.out.println("Hello, " + name + " Good Morning.");
    }
    void greetings(int time) {
        System.out.println("Hello, Good morning. The time is: " + time);
    }
}