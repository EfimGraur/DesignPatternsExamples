package Structural.Adapter.BestExampleAdapter;
//this is the Adaptee
//this is some old API that we do not want to change
//we can't change this code it's 3rd party stuff
public class OldTv {
    public void turnKnotLeft(){
        System.out.println("Turning Know left");
    }

    public void turnKnotRight(){
        System.out.println("Turning Knot Right");
    }
}
