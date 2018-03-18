package Structural.Adapter.AdapterSimpleExample;

public class AmericanCow implements Cow {
    @Override
    public void moo() {
        System.out.println("Mooo");
    }

    @Override
    public void eatGrass() {
        System.out.println("Cow eating grass ...");
    }
}
