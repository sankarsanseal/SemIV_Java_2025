/*
Program to implement Java Database Connection 
The program will generate message for successful connection and errors otherwise
Host Address, Database name, username and password are acquired from the user

Author: Aditaya Samui
Date: 27-08-2025
*/

import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;

public class Database {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the inputs from user
        System.out.println("Enter Host Address:");  //jdbc:mysql://localhost:3306
        String host = sc.next();
        System.out.print("Enter Database name:");   //It will be concatenated with host address in url
        String db = sc.next();
        System.out.print("Enter User name:");
        String user = sc.next();
        System.out.print("Enter Password:");
        String pw = sc.next();
        sc.close();

        //JDBC Connection in try-catch block
        try{

            //Loads and registers the JDBC Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Opens a physical network connection to the database
            Connection con = DriverManager.getConnection(host+"/"+db, user, pw);

            System.out.println("Connection Successful!");
            con.close();    //closing the connection 
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
