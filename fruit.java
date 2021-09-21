import java.net.SocketPermission;
import java.util.Scanner;

public class fruit {
    public static Scanner input = new Scanner(System.in);
    public static int quantity;
    public static double total = 0;
    public static int choose;
    public static String repeat;

    public void products() {
        System.out.println("Here are the products available in our store : ");
        System.out.println("1) Apple 100 per kg");
        System.out.println("2) Banana 50 per dozen");
        System.out.println("3) Grapes 250 per kg");
    }

    public void amount() {
        System.out.println("Which fruit you want ?");
        choose = input.nextInt();
        if (choose = 1) {
            System.out.println("How many kg  apple you want ? ");
            quantity = input.nextInt();
            total = total + (quantity * 100);
            System.out.println("You want more?");
            repeat = input.next();
            if (repeat.equalsIgnoreCase("Y")) {
                products();
                amount();

            } else {
                System.out.println("Total price is : " + total);
            }

        } else if (choose = 2)

        {
            System.out.println("How many dozen banana you want ? ");
            quantity = input.nextInt();
            total = total + (quantity * 50);
            System.out.println("You want more?");
            repeat = input.next();
            if (repeat.equalsIgnoreCase("Y")) {
                products();
                amount();

            } else {
                System.out.println("Total price is : " + total);
            }

        } else if (choose = 3) {
            System.out.println("How many kg  grapes you want ? ");
            quantity = input.nextInt();
            total = total + (quantity * 250);
            System.out.println("You want more?");
            repeat = input.next();
            if (repeat.equalsIgnoreCase("Y")) {
                products();
                amount();

            } else {
                System.out.println("Total price is : " + total);
            }
        }
    }

    public static void main(String[] args) {
        fruit x = new fruit();
        x.products();
        x.amount();
    }

}
