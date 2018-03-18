package Structural.Adapter.BestExampleAdapter;

public class Client {
    public static void main(String[] args) {
        IRemoteControl remoteControl = new RemoteControl(new OldTv());
        remoteControl.pressOnButton();
        remoteControl.pressOffButton();
    }
}
