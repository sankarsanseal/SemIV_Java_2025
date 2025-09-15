import java.net.*;   // for InetAddress
import java.util.*;  // for Scanner

public class GetIPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // take website name from user
            System.out.print("Enter website: ");
            String website = sc.nextLine();

            // fetch the IP address using InetAddress
            InetAddress inet = InetAddress.getByName(website);

            // print the IP address
            System.out.println("IP Address: " + inet.getHostAddress());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}