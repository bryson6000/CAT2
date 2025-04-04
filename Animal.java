class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}


class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();
    }
}
