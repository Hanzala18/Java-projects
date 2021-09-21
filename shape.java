import java.net.SocketPermission;

public class shape {
    public int lambai;
    public int chorai;

    public shape(int l, int c) {
        lambai = l;
        chorai = c;

    }

    public void area() {
        System.out.println("the area is " + lambai * chorai);
    }

    // class m {
    public static void main(String[] args) {
        shape obj = new shape(7, 3);
        obj.area();
    }
    // }

}
