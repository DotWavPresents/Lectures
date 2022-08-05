package Exercises.State.AutomaticDoor;

public class Door {
    private DoorState state = new DoorState.DoorClosed(this);

    protected void setState(DoorState state) { this.state = state; }

    public void click() {
        System.out.print("[" + status() + "]");
        // TODO: After implementing the necessary methods on DoorState, call them here
        System.out.println(" --(click)-> [" + status() + "]");
    }
    public void complete() {
        System.out.print("[" + status() + "]");
        // TODO: After implementing the necessary methods on DoorState, call them here
        System.out.println(" --(complete)-> [" + status() + "]");
    }
    public void timeout()  {
        System.out.print("[" + status() + "]");
        // TODO: After implementing the necessary methods on DoorState, call them here
        System.out.println(" --(timeout)-> [" + status() + "]");
    }

    public String status() {
        // TODO: After implementing the necessary methods on DoorState, call them here
        return "";
    }
}
