package Exercises.State.AutomaticDoor;

public class Main {

    public static void main(String[] args) {
        /* TODO:
         * 1) In the "AutomaticDoorStateDiagram.png" picture, you may find the door’s possible states.
         * 2) The states transition to each-other if and only if the specified stimulus are applied.
         * 3) The stimulus are:
         *  a) Click (open/close button),
         *  b) Complete (end of opening/closing cycle),
         *  c) Timeout (too much time has passed in a specific state).
         *
         *  Complete the TODOs inside DoorState and Door and check for yourself if the prints make sense
         * */

        Door door = new Door();   // Closed
        door.click();
        door.complete();
        door.timeout();
        door.click();
        door.status();
        door.complete();
        door.click();
        door.click();
        door.click();
        door.complete();
        door.timeout();
        door.complete();
    }
}
