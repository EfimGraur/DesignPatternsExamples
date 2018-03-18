package Structural.Adapter.BestExampleAdapter;

public class RemoteControl implements IRemoteControl {

    //Injecting the adaptee
    OldTv oldTv;

    public RemoteControl(OldTv oldTv) {
        this.oldTv = oldTv;
    }

    @Override
    public void pressOnButton() {
        oldTv.turnKnotLeft();
    }

    @Override
    public void pressOffButton() {
        oldTv.turnKnotRight();
    }
}
