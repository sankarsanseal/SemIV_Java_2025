import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test{
    public static void main(String[] args) {
        // Database connection details
        String host = "jdbc:mysql://cgcdeep-HP-Pavilion-Desktop-PC-570-p0xx.local/SemIV2025";
        String user = "SemIV2025";        
        String password = "admin123"; 

        try {
            // Load MySQL JDBC Driver (optional in newer versions of Java)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(host, user, password);
            System.out.println("Connected to the database!");

            // Create a statement
            Statement stmt = conn.createStatement();

            // Execute a query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // Process the result set
            while (rs.next()) {
                String id = rs.getString("ROLLNO");
                String name = rs.getString("NAME");
                String pname = rs.getString("PARENTS_NAME");
                String sub = rs.getString("SUBJECT_NAME");

                System.out.println(id + " | " + name + " | " + pname + " | " + sub);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

