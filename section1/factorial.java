package section1;
public class factorial {

    public static int getFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; // Change this value to compute factorial of a different number
        System.out.println("Factorial of " + n + " is: " + getFactorial(n));
    }
}
