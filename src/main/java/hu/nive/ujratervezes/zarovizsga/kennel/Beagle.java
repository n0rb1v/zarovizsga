package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog {
    public Beagle(String name) {
        super(name);
    }
    public void feed() {
        super.happiness += 2;
    }
    public void play(int i) {
        super.happiness += i*2;
    }
}
