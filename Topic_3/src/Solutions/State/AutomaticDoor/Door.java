package Solutions.State.AutomaticDoor;

public class Door {
    private DoorState state = new DoorState.DoorClosed(this);

    protected void setState(DoorState state) { this.state = state; }

    public void click() {
        System.out.print("[" + status() + "]");
        state.click();
        System.out.println(" --(click)-> [" + status() + "]");
    }
    public void complete() {
        System.out.print("[" + status() + "]");
        state.complete();
        System.out.println(" --(complete)-> [" + status() + "]");
    }
    public void timeout()  {
        System.out.print("[" + status() + "]");
        state.timeout();
        System.out.println(" --(timeout)-> [" + status() + "]");
    }

    public String status() {
        return state.status();
    }
}
