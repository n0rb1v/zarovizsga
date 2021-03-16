package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    List<Dog> dogs = new ArrayList<>();

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void feedAll() {
        for (Dog item : dogs) {
            item.feed();
        }
    }

    public Dog findByName(String name) {
        for (Dog item : dogs) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        throw new IllegalArgumentException("nincs talalat");
    }

    public void playWith(String name, int hours) {
        findByName(name).play(hours);
    }

    public List<String> getHappyDogNames(int minHappiness) {
        List<String> result = new ArrayList<>();
        for (Dog item : dogs) {
            if (item.getHappiness() > minHappiness) {
                result.add(item.getName());
            }
        }
        return result;
    }

    public List<Dog> getDogs() {
        return dogs;
    }
}
