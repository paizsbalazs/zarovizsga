package hu.nive.ujratervezes.zarovizsga;

import com.sun.jdi.StringReference;

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

        for (int i = 0; i< dogs.size(); i++) {

            dogs.get(i).feed();

        }

    }

    public Dog findByName(String s) {

        for (Dog d: dogs) {
            if (d.getName().equals(s)) {
                return d;
            }
        }

        throw new IllegalArgumentException(s);
    }

    public void playWith(String name, int hours) {

        for (Dog d:dogs) {
            if (d.getName().equals(name)) {
                d.play(hours);
            }
        }

    }

    public List<String> getHappyDogNames(int minHappiness) {
        List<String> result = new ArrayList<>();

        for (Dog d:dogs) {
            if (d.getHappiness()>minHappiness) {
                result.add(d.getName());
            }
        }

        return result;
    }
}
