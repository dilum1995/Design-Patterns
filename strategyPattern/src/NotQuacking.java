public class NotQuacking implements QuackBehaviour{
    @Override
    public String quack(String NameOfTheDuck) {
        String output = NameOfTheDuck+" has a silent quacking behaviour";
        return output;
    }
}
