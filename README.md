# Java Lambda Pet Simulator


## What is a Lambda Function?

In Java, a lambda expression essentially is an invisible method that can be written in one line. It allows you to pass in parameters as data too, which simplifies code and makes it easier to read.

A lambda expression can be used directly where a single-method interface is expected, there is no need for an external class.

## How Lamba is Used in This Program

The program uses the standard Java `Predicate<T>`.

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
