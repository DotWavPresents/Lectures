package Examples.State.Semaphores.StateApproach;

public abstract class Ticking extends State {

    protected Ticking(Semaphore semaphore) {
        super(semaphore);
    }

    @Override
    public void off() {
        semaphore.setState(new Blinking(semaphore));
    }
}
