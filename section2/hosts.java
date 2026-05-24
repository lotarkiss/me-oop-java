package section2;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class hosts {
    public static void main(String[] args) {
        HashMap<String, String> hosts = new HashMap<String, String>();
        hosts.put("localhost", "127.0.0.1");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add hostname");
            System.out.println("2. Get IP address");
            System.out.println("3. Display all hostnames and IP addresses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline       

            switch (choice) {
                case 1:
                    System.out.print("Enter hostname: ");
                    String hostname = sc.nextLine();
                    System.out.print("Enter IP address: ");
                    String ipAddress = sc.nextLine();
                    hosts.put(hostname, ipAddress);
                    break;
                case 2:
                    System.out.print("Enter hostname: ");
                    String hostToGet = sc.nextLine();
                    String ip = hosts.get(hostToGet);
                    if (ip != null) {
                        System.out.println("IP address: " + ip);
                    } else {
                        System.out.println("Hostname not found.");
                    }
                    break;
                case 3:
                    System.out.println("Hostnames and IP addresses:");
                    for (Map.Entry<String, String> entry : hosts.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }   
        }
    }
}
