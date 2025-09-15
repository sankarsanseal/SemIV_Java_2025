/*
Program to fetch Internet Protocol Address of a valid website using java.net package

Author: Aditaya Samui
Date: 27-08-2025
*/

import java.util.Scanner;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a website URL:");
        String url = sc.next();
        sc.close();

        try {
            //Getting InetAddress object for the website
            InetAddress address = InetAddress.getByName(url);
            //Printing the IP address
            System.out.println("\nIP Address of \""+url+"\" is: "+address.getHostAddress());
        } 
        catch (UnknownHostException e) {
            System.out.println("\nWebsite URL not found.");
        }
    }
}
