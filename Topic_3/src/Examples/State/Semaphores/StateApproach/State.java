package Examples.State.Semaphores.StateApproach;

public abstract class State {

    protected final Semaphore semaphore;

    protected State(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public abstract void tick();

    public void panic() {
        semaphore.setState(new Panic(semaphore));
    }

    public void on() {
        // Ignored by default
    }

    public abstract void off();

    public abstract String status();

    public abstract String color();

    public abstract boolean canPeopleCross();

    public abstract boolean canCarsPass();
}
