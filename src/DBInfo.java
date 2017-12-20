import java.sql.Connection;
import java.sql.DriverManager;

public class DBInfo {
    static Connection con;

    public DBInfo() {
    }

    static {
        String url = "jdbc:mysql://localhost:3306/yourbank";
        String uname = "root";
        String pass = "rat";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, uname, pass);
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }
}
