import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class App {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn1 = DriverManager.getConnection("jdbc:mysql://cgcdeep-HP-Pavilion-Desktop-PC-570-p0xx.local/SemIV2025",
                                                    "SemIV2025",
                                                    "admin123");
        if(conn1 != null){
            System.out.println("Connection Established!");
        }

        Statement sql1 = conn1.createStatement();
        ResultSet res1 = sql1.executeQuery("select * from students");
        while(res1.next()){
            System.out.println(res1.getString(1));
        }

        PreparedStatement sql2 = conn1.prepareStatement("select * from students where RollNo = ?");
        sql2.setString(1, "2024254040002");
        ResultSet res2 = sql2.executeQuery();
        while(res2.next()){
            System.out.println(res2.getString(2));
        }
    }
}
