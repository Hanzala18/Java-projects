public class Rectangle {

    int length;
    int breadth;

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public void displayArea() {
        System.out.println("The Area Is: " + length * breadth);
    }

    public void displayPerimeter() {
        System.out.println("The Perimeter Is: " + 2 * (length + breadth));
    }
}

class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }
}

class big {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8, 9);
        System.out.println("=====================================================");
        System.out.println("\nThe Area And Perimeter Of Rectangle Is Given Blow\n");
        System.out.println("=====================================================");
        rectangle.displayArea();
        rectangle.displayPerimeter();
        Square square = new Square(3);
        System.out.println("=====================================================");
        System.out.println("\nThe Area And Perimeter Of Square Is Given Blow\n");
        System.out.println("=====================================================");
        square.displayArea();
        square.displayPerimeter();
        System.out.println("=====================================================");
    }
}