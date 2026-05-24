package section1;
import java.util.Scanner;
public class rectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        int width = input.nextInt();
        System.out.print("Enter height: ");
        int height = input.nextInt();
        input.close();

        System.out.println("Area: " + (width * height));
    }
}
