package section1;

public class prod9 {
    public static void main(String[] args) {
        int n = 9; // Change this value to compute the product of a different number
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }

        System.out.println("The product of the first " + n + " natural numbers is: " + product);
    }
}
