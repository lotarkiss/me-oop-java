package section2;

import java.util.Scanner;
import java.util.LinkedList;

public class lru {
    public static void main(String[] args) {
            LinkedList<String> cache = new LinkedList<String>();
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Enter a word (or 'exit' to quit, 'display' to show cache): ");
                String input = sc.next();
                if (input.equals("exit")) {
                    break;
                } else if (input.equals("display")) {
                    System.out.println("LRU Cache: " + cache);
                } else {
                    if (cache.contains(input)) {
                        cache.remove(input);
                    }
                    cache.addFirst(input);
                }
            }
            sc.close();
            
    }   
}
