package Examples.State.Semaphores.StateApproach;

public class Yellow extends Ticking {

    protected Yellow(Semaphore semaphore) {
        super(semaphore);
    }

    @Override
    public void tick() {
        semaphore.setState(new Red(semaphore));
    }

    @Override
    public String status() {
        return "Yellow";
    }

    @Override
    public String color() {
        return "Yellow";
    }

    @Override
    public boolean canPeopleCross() {
        return false;
    }

    @Override
    public boolean canCarsPass() {
        return true;
    }
}
