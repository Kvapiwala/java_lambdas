# Java Lambda Pet Simulator

## Overview

This repository contains a simple Java program that simulates caring for pets and demonstrates how a lambda expression can be used in Java.

The program consists of two classes:

- `Pet.java` - defines a `Pet` object with attributes for name, type, owner, energy, and happiness.
- `PetSimulator.java` - creates and manages a collection of pets, performs actions on them, and evaluates pet happiness using a lambda expression.

## What is a Lambda Function?

In Java, a lambda expression is a short way to represent an anonymous function. It allows you to pass behavior as data, making code more concise and easier to read.

Instead of creating a separate class or anonymous inner class to implement a functional interface, a lambda expression can be used directly where a single-method interface is expected.

## How It’s Used in This Program

The program uses the standard Java `Predicate<T>` functional interface from `java.util.function`.

A `Predicate<Pet>` is a function that takes a `Pet` object and returns `true` or `false` based on a condition.

In `PetSimulator.java`, the lambda expression is created like this:

```java
Predicate<Pet> happinessPredicate = pet -> pet.getHappy() > 20;
```

This lambda checks whether a pet's happiness value is greater than 20.

The lambda is then passed to `Pet.showHappiness(...)`:

```java
Pet.showHappiness(petList, happinessPredicate);
```

Inside `Pet.showHappiness`, the predicate is applied to each pet:

```java
if (predicate.test(pet)) {
  System.out.println(pet.getName() + " is happy!");
} else {
  System.out.println(pet.getName() + " may need some love.");
}
```

This makes the code flexible: you can change the happiness test without modifying the method logic.

## Program Behavior

`PetSimulator` does the following:

1. Creates pets and assigns names and types.
2. Feeds pets and sets the owner.
3. Makes dogs bark and walk.
4. Makes cats meow.
5. Gives treats and plays with pets.
6. Puts pets to sleep and feeds them again.
7. Prints the pet state.
8. Creates a separate list of pets and evaluates their happiness using lambda conditions.

## Lambda Examples in the Program

- `pet -> pet.getHappy() > 20`
- `pet -> pet.getHappy() >= 30`

These two lambda expressions are used to evaluate whether each pet is "happy" or "very happy".

## How to Run

From the repository folder, compile and run the program with:

```bash
javac Pet.java PetSimulator.java
java PetSimulator
```

## Why This Matters

Using lambda expressions improves readability and allows behavior to be passed into methods easily. In this example, the same `showHappiness` method can evaluate different happiness thresholds without changing its implementation.
