import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        // Change these to match your setup
        String url = "jdbc:mysql://cgcdeep-HP-Pavilion-Desktop-PC-570-p0xx.local/SemIV2025"; // Replace testdb with your DB name
        String user = "SemIV2025";                               // Your DB username
        String password = "admin123";                       // Your DB password

        try {
            // Load MySQL JDBC Driver (optional since JDBC 4.0)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println(" Connection successful!");

            // Create and execute a simple query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT VERSION()");

            // Print result
            if (rs.next()) {
                System.out.println("MySQL Version: " + rs.getString(1));
            }

            // Clean up
            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}

