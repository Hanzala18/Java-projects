import java.util.Scanner;
import java.util.Scannner;

public class grading {
    public static Scanner input = new Scanner(System.in);
    public static int marks;

    public static void grades() {// function
        System.out.println("please enter your maths marks");
        marks = input.nextInt();
        if (marks >= 87 && marks <= 100) {
            System.out.println("Grade is A");
        } else if (marks >= 75 && marks <= 85) {
            System.out.println("Grade is B");
        }

    }

    public static void main(String[] args) {
        grading x = new grading();// calling object
        x.grades();// calling function through object
    }

}
