package Examples.Strategy.Ducks;

public class NormalQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
