package com.nabrissa;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8,20, 2,4, 1, 20, "long silky");

        dog.eat();
        dog.walk();
        dog.run();

        Fish shark = new Fish("White Shark",19,320,6,2,8);
        shark.swim(20);

    }
}
