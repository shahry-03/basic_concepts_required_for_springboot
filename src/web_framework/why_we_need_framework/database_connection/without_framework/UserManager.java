package web_framework.why_we_need_framework.database_connection.without_framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserManager {
    public void saveUser(String name, String email) {
        // Variables declare karne padenge taake finally block me close kar sakein
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Step:no1: Driver load karo
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Step:no:2. Connection Open karo (Ye har baar likhna padega)
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Shahry$19811825$");

            //Step:no:3. SQL Query likho
            String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

            // 4. Statement banao
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, email);

            // 5. Execute karo
            statement.executeUpdate();
            System.out.println("User Saved");

        } catch (Exception e) {
            e.printStackTrace();
        } finally  {
            // 7. CONNECTION CLOSE KARNA (Sabse important aur boring kaam)
            // Agar ye bhool gaye, to database server full ho jayega
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    

}
