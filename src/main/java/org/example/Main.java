package org.example;        // Nov 2024

import java.util.ArrayList;

// Main class to test the interface
public class Main {

    public static void main(String[] args) {

        // Because a Dog implements the Animal interface, we can assign
        // a Dog object to a reference of type Animal.
        // (A Dog is also an Animal)

        Animal myDog = new Dog(); // Create a Dog object
        Animal myCat = new Cat();  // Create a Cat object
        Animal myDuck = new Duck();

        // the call to method sound() will call the sound() method that
        // was declared for the class-type of the object.
        // i.e. it depends on the object (it is polymorphic)

        myDog.sound(); // Outputs: Bark
        myCat.sound(); // Outputs: Meow

        // This is useful for creating lists of objects.
        ArrayList<Animal> listOfAnimals  = new ArrayList<>();
        listOfAnimals.add(myDog);
        listOfAnimals.add(myCat);
        listOfAnimals.add(myDuck);
        for (Animal animal : listOfAnimals) {
            animal.sound();
        }
    }
}

//TODO
// 1. Add a new animal "Duck" class that implements the Animal interface
// 2. Create a new Duck object, and add the duck to the arraylist of animals.
// 3. Run program.  Notice that the loop to print animal sounds can deal with a duck
// because the Duck class has adhered to the contract to make an object an Animal
// (.ie. Duck has implemented the Animal interface)

//TODO
// 4. Add a new abstract method to Animal called legCount() (no implementation)
// 5. Update all classes that implement Animal so that they adhere to the new contract
//    by implementing the legCount() method in each class. (Simply print number of legs)
// 6. Update the loop so that the legCount( )is called for all animals.
// 7. Run and check output.




