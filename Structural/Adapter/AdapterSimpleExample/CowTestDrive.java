package Structural.Adapter.AdapterSimpleExample;

public class CowTestDrive {
    public static void main(String[] args) {
        Giraffe giraffe = new AfricanGirafe();
        testGiraffe(giraffe);

        Cow cow= new AmericanCow();

        Giraffe cowAddapter = new CowAdapter(cow );
        testGiraffe(cowAddapter);


    }
    public static void testGiraffe(Giraffe giraffe){
        giraffe.giraffMoo();
        giraffe.giraffEat();
    }
}
