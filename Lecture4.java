import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// Base class demonstrating encapsulation
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collector called for " + name);
    }
}

// Derived class demonstrating inheritance and polymorphism
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Runnable class for multithreading
class MultithreadingDemo implements Runnable {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
    }
}

public class Lecture4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // OOP: Creating objects and demonstrating polymorphism
        Animal myAnimal = new Animal("Generic Animal");
        Dog myDog = new Dog("Rover");

        System.out.println(myAnimal.getName() + " says:");
        myAnimal.makeSound();

        System.out.println(myDog.getName() + " says:");
        myDog.makeSound();

        // Exception handling
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } finally {
            System.out.println("Exception handling demo completed");
        }

        // Multithreading
        int n = 5; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(new MultithreadingDemo());
            thread.start();
        }

        // Collections framework and lambda expressions
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Fruits:");
        fruits.forEach((fruit) -> System.out.println(fruit));

        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "John");
        students.put(2, "Jane");
        students.put(3, "Jack");

        System.out.println("Students:");
        students.forEach((id, name) -> System.out.println("ID: " + id + ", Name: " + name));

        // Demonstrating garbage collection
        Animal gcDemoAnimal = new Animal("Temporary Animal");
        gcDemoAnimal = null;
        System.gc(); // Requesting JVM to run Garbage Collector

        System.out.println("Garbage Collection demo completed");

        sc.close();
    }
}
