//Main class
public class Main {
    public static void main(String[] args) {
        System.out.println("------ Strategy Pattern Demo ------\n");

        //City duck type
        Duck cityDuck = new Duck(new FastFlying(), new NotQuacking());
        System.out.println(cityDuck.fly("CityDuck"));
        System.out.println(cityDuck.quack("CityDuck"));
        System.out.println("\n");
        //Wild duck type
        Duck wildDuck = new Duck(new SlowFlying(), new LouderQuacking());
        System.out.println(wildDuck.fly("WildDuck"));
        System.out.println(wildDuck.quack("WildDuck"));


    }
}
