package lt.kaunascoding.model.strategies;

public class SneakStrategy implements IActionStrategy {
    @Override
    public void doAction() {
        System.out.println("I sneak");
    }
}
