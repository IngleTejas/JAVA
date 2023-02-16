package Oops.polymorphism.methodOverriding;

public class animalTest {
    public static void main(String args[]){


    Animal animal = new Animal();
    Cat cat = new Cat();
    Dog dog = new Dog();

    animal.makeSound();
    cat.makeSound();
    dog.makeSound();
        }
}
