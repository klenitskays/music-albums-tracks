
import java.sql.*;

public class Test {

    public  static void main(String []args){

        String url = "jdbc:mysql://localhost:3306/music";
        String username = "root";
        String password = "Kakashi_2481632";



        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
            String sql = "select * from albums";

//            PreparedStatement pst = connection.prepareStatement(sql);

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from albums");

            int code;
            String title;
            while (resultSet.next()) {
                title = resultSet.getString("id").trim();
                System.out.println(" Title : " + title);
            }
            resultSet.close();
            statement.close();
            connection.close();


            System.out.println("A new author has been inserted");

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
}
