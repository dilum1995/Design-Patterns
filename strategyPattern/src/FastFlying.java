//Concrete class which explains the logic of a particular strategy
public class FastFlying implements FlyingBehaviour {
    @Override
    public String fly(String NameOfTheDuck) {
        return NameOfTheDuck+" has a faster flying behaviour";
    }
}
