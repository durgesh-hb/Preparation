// ===============================
//  INHERITANCE FULL REVISION
// ===============================
package OOPS.Inheritance;
// Parent Class
class Animal {
    String color = "White";

    // Constructor
    Animal() {
        System.out.println("Animal Constructor");
    }

    // Method
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// ===============================
// 1️⃣ Single Inheritance
// ===============================
class Dog extends Animal {

    String color = "Black";

    Dog() {
        super(); // calling parent constructor
        System.out.println("Dog Constructor");
    }

    // Method Overriding (Polymorphism)
    void sound() {
        System.out.println("Dog barks");
    }

    void show() {
        System.out.println("Child color: " + color);
        System.out.println("Parent color: " + super.color);

        super.sound(); // call parent method
    }
}

// ===============================
// 2️⃣ Multilevel Inheritance
// ===============================
class Puppy extends Dog {

    Puppy() {
        System.out.println("Puppy Constructor");
    }

    void display() {
        System.out.println("This is multilevel inheritance");
    }
}

// ===============================
// 3️⃣ Hierarchical Inheritance
// ===============================
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }
}

// ===============================
// 4️⃣ Multiple Inheritance (Using Interface)
// ===============================
interface A {
    default void showA() {
        System.out.println("Interface A");
    }
}

interface B {
    default void showB() {
        System.out.println("Interface B");
    }
}

class Multi implements A, B {
    void display() {
        System.out.println("Multiple Inheritance using Interface");
    }
}

// ===============================
// 5️⃣ Main Class (Test Everything)
// ===============================
public class inherit {

    public static void main(String[] args) {

        System.out.println("---- Single Inheritance ----");
        Dog d = new Dog();
        d.sound(); // overridden
        d.show();

        System.out.println("\n---- Multilevel Inheritance ----");
        Puppy p = new Puppy();
        p.display();

        System.out.println("\n---- Hierarchical Inheritance ----");
        Animal a;

        a = new Cat();
        a.sound();

        a = new Cow();
        a.sound();

        System.out.println("\n---- Multiple Inheritance (Interface) ----");
        Multi m = new Multi();
        m.showA();
        m.showB();
        m.display();
    }
}