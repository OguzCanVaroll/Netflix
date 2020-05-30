package netflix;
import java.sql.*;

public class conDB {


    public static Connection connectVeri(){

        Connection con = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://db4free.net:3306/codeflix";
        String user = "oguzaybars";
        String password = "kocaeli123";
        while(con == null) {
            try {
                Class.forName(driver);
                con = DriverManager.getConnection(url, user, password);
                System.out.println("Bağlantı başarılı...");
                return con;
            } catch (Exception e) {
                System.out.println("Bağlantı başarısız...");
                return null;
            }
        }

        return con;
    }


}
