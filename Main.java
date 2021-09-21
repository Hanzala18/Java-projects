public class Main {
    public static void printArea(int x, int y) {
        System.out.println(x * y);
    }

    public static void printArea(int x) {
        System.out.println(x * x);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.printArea(5, 6);
        obj.printArea(5);
    }
}