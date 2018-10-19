package lt.kaunascoding.model.strategies;

public class WalkStrategy implements IActionStrategy {
    @Override
    public void doAction() {
        System.out.println("I walk");
    }
}
