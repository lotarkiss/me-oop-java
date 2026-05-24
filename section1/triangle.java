package section1;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle: ");
        int a = input.nextInt();
        System.out.println("Enter the second side of the triangle: ");
        int b = input.nextInt();
        System.out.println("Enter the third side of the triangle: ");
        int c = input.nextInt();
        input.close();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The sides " + a + ", " + b + ", and " + c + " form a valid triangle.");
        } else {
            System.out.println("The sides " + a + ", " + b + ", and " + c + " do not form a valid triangle.");
        }   
    }
}
