package Examples.State.Semaphores.StateApproach;

public class Green extends Ticking {

    protected Green(Semaphore semaphore) {
        super(semaphore);
    }

    @Override
    public void tick() {
        semaphore.setState(new Yellow(semaphore));
    }

    @Override
    public String status() {
        return "Green";
    }

    @Override
    public String color() {
        return "Green";
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
