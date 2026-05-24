package section2;
import java.util.Scanner;
import java.util.Stack;

public class numconv {
    public static char[] charmap = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to convert to another base: ");
        int num = sc.nextInt();
        System.out.print("Enter the base to convert to: ");
        int base = sc.nextInt();
        sc.close();

        Stack<Integer> _stack = new Stack<Integer>();
        while (num > 0) {
            _stack.push(num % base);
            num /= base;
        }

        System.out.print("The number in base " + base + " is: ");
        while (!_stack.isEmpty()) {
            System.out.print(charmap[_stack.pop()]);
        }
        System.out.println();
    }
}