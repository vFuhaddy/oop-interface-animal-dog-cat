package org.example;

// Implement the interface in a Cat class
class Cat implements Animal {

    // Once we state that the class "implements" the interface named Animal
    // then we must write the code to override the sound() method for this Cat class.

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
