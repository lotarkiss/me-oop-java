package section1;

public class sum100 {
    public static void main(String[] args) {
        int n = 100; // Change this value to compute the sum of a different number
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
