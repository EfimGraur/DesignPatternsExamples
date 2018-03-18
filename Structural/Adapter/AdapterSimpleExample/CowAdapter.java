package Structural.Adapter.AdapterSimpleExample;

public class CowAdapter implements Giraffe {

    Cow cow;

    public CowAdapter(Cow cow) {
        this.cow = cow;
    }

    @Override
    public void giraffMoo() {
            cow.moo();
    }

    @Override
    public void giraffEat() {
        cow.eatGrass();
    }
}
