//Context or the client class
public class Duck {

    FlyingBehaviour flyingBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck(FlyingBehaviour flyingBehaviour, QuackBehaviour quackBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public String fly(String NameOfTheDuck){
        return this.flyingBehaviour.fly(NameOfTheDuck);
    }

    public String  quack(String NameOfTheDuck){
        return this.quackBehaviour.quack(NameOfTheDuck);
    }
}
