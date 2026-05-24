package section2;
import java.util.Scanner;
import java.util.ArrayList;

public class wc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (sc.hasNext()) {
            String word = sc.next();
            if (!words.contains(word)) {
                words.add(word);
            }
        }
        sc.close();

        int maxCount = 0;
        String mostFrequentWord = null;
        for (String word : words) {
            int count = 0;
            for (String w : words) {
                if (w.equals(word)) {
                    count++;        
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequentWord = word;
            }       
        }

        System.out.println("The most frequent word is: " + mostFrequentWord);   
    }
}
