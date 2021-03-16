package hu.nive.ujratervezes.zarovizsga;

public class Beagle extends Dog {

    public Beagle(String name) {
        super(name);
    }

    @Override
    public void feed() {
        this.happiness = this.getHappiness() + 2;
    }

    @Override
    public void play(int hours) {
        this.happiness = this.getHappiness() + (hours * 2);
    }

}
