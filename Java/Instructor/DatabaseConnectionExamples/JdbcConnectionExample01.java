import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
// import com.mysql.cj.jdbc.Driver;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;



public class JdbcConnectionExample01{

    // com.mysql.cj.jdbc.MysqlXADataSource
    //  com.mysql.cj.jdbc.Driver

    // jdbc:mysql://host1:33060/sakila
    // cgcdeep-HP-Pavilion-Desktop-PC-570-p0xx.local
    public static void main(String [] args){

    try{
        Class.forName("com.mysql.cj.jdbc.Driver");


        Connection conn = DriverManager.getConnection(
            // "jdbc:mysql://cgcdeep-HP-Pavilion-Desktop-PC-570-p0xx.local:3306/SemIV2025", 
            "jdbc:mysql://cgcdeep-HP-Pavilion-Desktop-PC-570-p0xx.local/SemIV2025",
                                                    "SemIV2025",
                                                    "admin123"
                                                );

        // Connection 

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("select * from students");
        ResultSetMetaData rsmt = rs.getMetaData();

        while(rs.next())
        {

            for(int col_count = 1; col_count <= rsmt.getColumnCount(); col_count ++)
            {
                System.out.print(rsmt.getColumnName(col_count) + ":");
                System.out.println(rs.getString(col_count));
            }   
            
            for(int space_count = 0 ; space_count < 80; space_count ++)
            {
                System.out.print( "-");
            }
            System.out.println();
            
        }


        }
    catch(SQLException se){
        System.out.println(se.getMessage());
    }
    // catch(ClassNotFoundException cn)
    // {
    //     System.out.println(cn.getMessage());
    // }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
}