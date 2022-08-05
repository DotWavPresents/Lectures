package Examples.State.Semaphores.StateApproach;

public class Semaphore {

    private State state;

    public Semaphore() {
        state = new Blinking(this);
    }

    public void on() {
        System.out.print("[" + status() + "]");
        state.on();
        System.out.println(" --(on)-> [" + status() + "]");
    }

    public void off() {
        System.out.print("[" + status() + "]");
        state.off();
        System.out.println(" --(off)-> [" + status() + "]");
    }

    public void panic() {
        System.out.print("[" + status() + "]");
        state.panic();
        System.out.println(" --(panic)-> [" + status() + "]");
    }

    public void tick() {
        System.out.print("[" + status() + "]");
        state.tick();
        System.out.println(" --(tick)-> [" + status() + "]");
    }

    public void canPeopleCross() {
        System.out.println("Can people pass? " + state.canPeopleCross());
    }

    public void canCarsPass() {
        System.out.println("Can cars pass? " + state.canCarsPass());
    }

    protected void setState(State state) {
        this.state = state;
    }

    public String status() {
        return state.status();
    }
}
