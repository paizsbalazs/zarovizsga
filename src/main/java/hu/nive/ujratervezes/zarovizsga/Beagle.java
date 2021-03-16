package hu.nive.ujratervezes.zarovizsga;

public class Beagle extends Dog {

    private String name;
    private int happiness;

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

    public static void main(String[] args) {
        Beagle b = new Beagle("Steve");
        b.feed();
        b.play(5);
        System.out.println(b.getHappiness());
    }
}
