import java.util.Scanner;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for Animal, 2 for Dog: ");
        int choice = sc.nextInt();

        Animal a;
        if(choice == 2)
            a = new Dog();
        else
            a = new Animal();

        a.sound(); // overridden method
    }
}