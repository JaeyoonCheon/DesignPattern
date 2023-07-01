public class MallardDuck extends Duck {
    // 전략(Strategy) 패턴!
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("Mallard Duck!");
    }
}
