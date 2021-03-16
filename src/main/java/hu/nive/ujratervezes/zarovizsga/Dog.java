package hu.nive.ujratervezes.zarovizsga;

public abstract class Dog {

    protected String name;
    protected int happiness;

    public Dog(String name) {
        this.name = name;
        this.happiness = 0;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    public void feed() {}
    public void play(int hours) {}
}
