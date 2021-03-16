package hu.nive.ujratervezes.zarovizsga;

import java.util.List;

public class Kennel {

    private List<Dog> kennel;

    public Kennel(List<Dog> kennel) {
        this.kennel = kennel;
    }

    public List<Dog> getKennel() {
        return kennel;
    }

    public void addDog(Dog dog) {

        if (dog!=null) {
            kennel.add(dog);
        }

    }

    public void feedAll() {

        for (Dog d: kennel) {
            d.feed();
        }

    }
}
