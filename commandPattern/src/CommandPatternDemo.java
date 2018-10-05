import java.util.Scanner;

public class CommandPatternDemo {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the stock name: ");
        String name = input.nextLine();
        System.out.println("please enter the quantity: ");
        int quantity = input.nextInt();

        Stock abcStock = new Stock(name, quantity);

       BuyStock buyStockOrder = new BuyStock(abcStock);
       SellStock sellStockOreder = new SellStock(abcStock);

       Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOreder);

        broker.placeOrder();
    }
}
