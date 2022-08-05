package Examples.Strategy.Ducks;

public class Duck {

    private final QuackBehaviour quackBehaviour;

    public Duck(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void quack() {
        quackBehaviour.quack();
    }
}
