package hu.nive.ujratervezes.zarovizsga;

public class Husky extends Dog {

    public Husky(String name) {
        super(name);
    }

    @Override
    public void feed() {
        this.happiness = this.getHappiness() + 2;
    }

    @Override
    public void play(int hours) {
        this.happiness = this.getHappiness() + (hours * 3);
    }

}
