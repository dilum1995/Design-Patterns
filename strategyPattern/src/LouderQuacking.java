public class LouderQuacking implements QuackBehaviour{
    @Override
    public String quack(String NameOfTheDuck) {
        String output = NameOfTheDuck+" has a louder quacking behaviour";
        return output;
    }
}
