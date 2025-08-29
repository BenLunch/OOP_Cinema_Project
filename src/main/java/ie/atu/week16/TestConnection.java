package ie.atu.week16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {

        Connection connection = null;

        try {
            //Load driver class
            //Hard coded values for now, in the future using a properties file is preferred
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Create a connection to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema_database", "root", "password");
            System.out.println("Connected to database successfully");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally
        {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
