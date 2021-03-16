package hu.nive.ujratervezes.zarovizsga;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    private List<Dog> dogs = new ArrayList<>();

    public Kennel() {
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void addDog(Dog dog) {

        if (dog!=null) {
            dogs.add(dog);
        }

    }

    public void feedAll() {

        for (Dog d: dogs) {
            d.feed();
        }

    }
}
