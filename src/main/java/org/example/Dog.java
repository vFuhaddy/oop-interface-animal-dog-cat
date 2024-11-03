package org.example;

// Implement the interface in a Dog class

class Dog implements Animal {

    // Once we state that the class "implements" the interface named Animal
    // then we must write the code to override the sound() method for this Dog class.

    @Override
    public void sound() {
        System.out.println("Bark - woff, woff."); // the sound that a dog makes
    }
}
