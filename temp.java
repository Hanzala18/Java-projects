import java.net.SocketPermission;

public class temp {
    public static void main(String[] args) {
        float centigrade, temp1, temp2, fahrenheit;
        float temp3, temp4, newCentigrade;
        centigrade = 27;
        temp1 = 9 / 5;
        temp2 = centigrade * temp1;
        fahrenheit = temp2 + 32;
        // printf("The temperature in Fahrenheit is:%f", fahrenheit);
        System.out.println("The temperature in Fahrenheit is " + fahrenheit);
        temp3 = fahrenheit - 32;
        temp4 = 5 / 9;
        newCentigrade = temp3 * temp4;
        System.out.println("The temperature in Centrigrade is: " + newCentigrade);
    }
}
