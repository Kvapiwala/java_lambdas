/*
 * Activity 3.1.3
 */
import java.util.ArrayList;
import java.util.function.Predicate;

public class PetSimulator
{
  public static void main(String[] args)
  {
    // create an array that can hold up to 10 pets (does not require looping)
    Pet [] pets = new Pet[10];
    
    // adopt (create and name) four pets, two cats, two dogs (does not require looping)
    pets[0] = new Pet("Jerry", 1);
    pets[1] = new Pet("Bladdi", 1);
    pets[2] = new Pet("Anda", 2);
    pets[3] = new Pet("Pooper Scooper", 2);

    // first things first, feed your pets
    
    for (Pet pet : pets) {
      if (pet != null) {
        pet.feed();
      }
    }

    // next, make yourself the owner of all of your new pets
    for (Pet pet: pets) {
      if (pet != null) {
        pet.setOwner("Kush");
      }
    }

    // your dogs make some noise, take them for a walk

    for (Pet pet : pets) {
      if (pet != null && pet.getType() == 2 ) {
        pet.makeNoise();
        pet.walk();
      }
    }

    // when you get back, your cats make some noise

   for (Pet pet : pets) {
      if (pet != null && pet.getType() == 1 ) {
        pet.makeNoise();
      }
    }
    
    // give all of your pets a treat

   for (Pet pet: pets) {
      if (pet != null) {
        pet.giveTreat();
      }
    }

    // groom your cats

    for (Pet pet : pets) {
      if (pet != null && pet.getType() == 2) {
        pet.groom();
      }
    }
    // grooming is done, play with all pets
    for (Pet pet: pets) {
      if (pet != null) {
        pet.play();
      }
    }

    // whew, that was tiring, all pets nap and get fed
    for (Pet pet: pets) {
      if (pet != null) {
        pet.sleep();
        pet.feed();
      }
    }

    System.out.println("--- MY PETS ---");
    // show the state of all of your pets
    for (Pet pet: pets) {
      if (pet != null) {
        System.out.println(pet);
      }
    }
    
    // You decide to get a couple of pets for your friend (does not require looping)
    pets[4] = new Pet("Jimbo", 1);
    pets[5] = new Pet("Ahmed", 1);
    pets[6] = new Pet("Jamal", 2);
    pets[7] = new Pet("Gigglepooper", 2);
    
    // set the owner of the new pets to your friends name

    for (int i = 4; i <= 7; i++) {
      pets[i].setOwner("Arshan");
    }

    System.out.println("--- MY PETS ---");
    for (Pet pet : pets) {
      if (pet != null) {
        System.out.println(pet);
      }
    }

    ArrayList<Pet> petList = new ArrayList<>();
    petList.add(new Pet("Jimbo", Pet.CAT));
    petList.add(new Pet("Ahmed", Pet.DOG));
    petList.add(new Pet("Jamal", Pet.CAT));
    petList.add(new Pet("Gigglepooper", Pet.DOG));

    Predicate<Pet> happinessPredicate = pet -> pet.getHappy() > 20;
    System.out.println("The pet is happy(happiness > 20)");
    Pet.showHappiness(petList, happinessPredicate);

    petList.get(0).feed();
    petList.get(1).play();
    petList.get(2).giveTreat();
    petList.get(2).giveTreat();
    petList.get(0).feed();
    petList.get(2).giveTreat();

    happinessPredicate = pet -> pet.getHappy() >= 30;
    System.out.println("The pet is VERY happy(happiness >= 30)");
    Pet.showHappiness(petList, happinessPredicate);

  }
}