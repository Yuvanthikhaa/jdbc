import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "Password@69");
            System.out.println("Connection established");
            Statement st = con.createStatement();
            System.out.println("enter sno: ");
            int sno = scan.nextInt();
            System.out.println("enter name:");
            String namee = scan.next();
            st.executeUpdate("insert into tbl values('" + sno + "','" + namee + "')");
            System.out.println("inserted successfully");
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}