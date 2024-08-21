// OOPs 1 ---->

// class and objects
// constructors
// method + constructor overloading
// this keyword

package oops;


// public class can only be one and that is the filename.
public class Main {
    public static void main(String[] args) {
//        Dog d1 = new Dog();  // new is used to create new object in java
//        d1.name = "Tommy";
//        d1.bark();
//        d1.walk();
//
//        Dog d2 = new Dog();
//        d2.name = "Leo";
//        d2.walk();
//        d2.print();

        Complex num1 = new Complex();
        num1.a = 3;
        num1.b = 2;
        num1.print();
    }
}

class Complex {
    int a, b;
    void print() {
        System.out.println(a+ " + " + b + "i");
    }
}

// A class does not allocate any memory when it is defied. An Object is allocated memory when it is created.
// A class is logical entity and an object is a physical entity.
// A class is declared once. On the other hand, we can create multiple objects of a class.
// A class is a way to organise the properties and behaviours of objects.
class Dog {   // factory
    // properties or data members
    String name;
    int age;
    String color;

    // behaviour or member functions
    void walk() {
        System.out.println(name + " is walking.");
    }
    void bark() {
        System.out.println(name + " is Barking.");
    }
    void print() {
        System.out.println(name);
    }
}

class Cat {

}
