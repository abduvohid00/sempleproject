import java.sql.*;

public class MysqlCon {
    public static void main(String[] args)throws SQLException {

            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root","");
//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Categories");
            while (rs.next())
                System.out.println(rs.getArray("CategoryID"));
            con.close();
        System.out.println("Code executed....");

    }
}

