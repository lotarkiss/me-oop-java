package section2;
import java.util.Scanner;

public class tempstat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of temperature readings: ");
        int n = sc.nextInt();
        double[] temperatures = new double[n];
        System.out.println("Enter the temperature readings:");
        for (int i = 0; i < n; i++) {
            temperatures[i] = sc.nextDouble();
        }
        sc.close();

        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double median = temperatures.length % 2 == 0 ? (temperatures[temperatures.length / 2 - 1] + temperatures[temperatures.length / 2]) / 2 : temperatures[temperatures.length / 2];
        double variance = 0;

        // Sum, max, and min calculations
        for (double temp : temperatures) {
            sum += temp;
            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
        }

        // Average and variance calculations
        double average = sum / temperatures.length;
        for (double temp : temperatures) {
            variance += Math.pow(temp - average, 2);
        }
        variance /= temperatures.length;        
        
        // Mode calculation
        double mode = 0;
        int modeArray[] = new int[n]; 
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (temperatures[i] == temperatures[j]) {
                    count++;
                }
            }
            modeArray[i] = count;
        }
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (modeArray[i] > maxCount) {
                maxCount = modeArray[i];
                mode = temperatures[i];
            }
        }

        // Output the results
        System.out.println("Average temperature: " + average);
        System.out.println("Maximum temperature: " + max);
        System.out.println("Minimum temperature: " + min);
        System.out.println("Median temperature: " + median);
        System.out.println("Mode temperature: " + mode);    
        System.out.println("Variance: " + variance);
    }
}
