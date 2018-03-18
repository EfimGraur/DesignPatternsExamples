package Structural.Adapter.AdapterSimpleExample;

public class AfricanGirafe implements Giraffe {
    @Override
    public void giraffMoo() {
        System.out.println("Giraffe Mooo");
    }

    @Override
    public void giraffEat() {
        System.out.println("Giraffe eating ");
    }
}
