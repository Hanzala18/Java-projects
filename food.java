import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class food {
    public static Scanner input = new Scanner(System.in);// input object
    public static String again;
    public static int choose, quantity = 1;// atributes
    public static double total = 0, pay;

    public static void menu() {// methods(functions)
        System.out.println("***********************************");
        System.out.println("        HOME MADE FOOD      ");
        System.out.println("              MENU         ");
        System.out.println("  1) Korma = 350                       ");
        System.out.println("  2) Nihari = 200                      ");
        System.out.println("  3) Roll = 120                        ");
        System.out.println("  4) Meal of the day = 250             ");
        System.out.println("  5) Sweet dish of the day = 150        ");
        System.out.println("***********************************");

    }

    public static void order() {
        System.out.println("Press 1 to order korma");
        System.out.println("Press 2 to order nihari");
        System.out.println("Press 3 to order roll");
        System.out.println("Press 4 to order Meal of the day");
        System.out.println("Press 5 to order Sweet dish of the day");
        System.out.println("Choose your order");
        choose = input.nextInt();

        if (choose == 1) {
            System.out.println("You have choosen korma");
            System.out.print("How many packs you want? : ");
            quantity = input.nextInt();
            total = total + (quantity * 350);

            System.out.println("You want to buy again ?");
            System.out.println("Press Y for yes or press N for cancel: ");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();

            } else {
                System.out.println("Total price is : " + total);
            }
        }

        else if (choose == 2) {
            System.out.println("You have choosen nihari");
            System.out.print("How many packs you want? : ");
            quantity = input.nextInt();
            total = total + (quantity * 200);

            System.out.println("You want to buy again ?");
            System.out.println("Press Y for yes or press N for cancel: ");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();

            } else {
                System.out.println("Total price is : " + total);
            }
        } else if (choose == 3) {
            System.out.println("You have choosen roll");
            System.out.print("How many packs you want? : ");
            quantity = input.nextInt();
            total = total + (quantity * 120);

            System.out.println("You want to buy again ?");
            System.out.println("Press Y for yes or press N for cancel: ");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();

            } else {
                System.out.println("Total price is : " + total);
            }
        } else if (choose == 4) {
            System.out.println("You have choosen Meal of the day");
            System.out.print("How many packs you want? : ");
            quantity = input.nextInt();
            total = total + (quantity * 250);

            System.out.println("You want to buy again ?");
            System.out.println("Press Y for yes or press N for cancel: ");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();

            } else {
                System.out.println("Total price is : " + total);
            }
        } else if (choose == 5) {
            System.out.println("You have choosen Sweet dish of the day");
            System.out.print("How many packs you want? : ");
            quantity = input.nextInt();
            total = total + (quantity * 150);

            System.out.println("You want to buy again ?");
            System.out.println("Press Y for yes or press N for cancel: ");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();

            } else {
                System.out.println("Total price is : " + total);
            }
        } else {
            System.out.println("You have choosen wrong option");
        }

    }

    public void info() {
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your address: ");
        String address = input.nextLine();

        System.out.println("Enter your email: ");
        String email = input.nextLine();

        System.out.println("Enter your phone number: ");
        int phone = input.nextInt();

        System.out.println("Select your payment method: ");
        System.out.println("Press 1 for credit card OR press 2 for cash ");
        int mode = input.nextInt();

        if (mode == 1) {
            System.out.println("Enter your credit card no");
            int credit = input.nextInt();
        } else if (mode == 2) {
            System.out.println("please pay bill to the rider");
        } else {
            System.out.println("Wrong option");

        }
    }

    public static void main(String[] args) {
        food fd = new food();
        fd.info();
        fd.menu();
        fd.order();
    }
}
