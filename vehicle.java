public class vehicle {
    int price;
    int quantity;

    public vehicle(int p, int q) {
        price = p;
        quantity = q;
    }

    public void rate() {// method

        System.out.println("vehicle is royalenfield , price is " + price);
    }

    public void much() {
        System.out.println("your total price is " + quantity * price);
    }

}

public class bike extends vehicle {
    public bike(int ride) {
        super(ride, ride);

    }

}

class Main {
    public static void main(String[] args) {
        vehicle obj = new vehicle(200000, 2);
        obj.rate();
        obj.much();

    }
}