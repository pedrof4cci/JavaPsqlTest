package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    String url = "jdbc:postgresql://localhost:5432/postgres?";
    String user = "";
    String password = "abacaxiHot";

    public Connection connection() {
        try {
            return DriverManager
                    .getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
