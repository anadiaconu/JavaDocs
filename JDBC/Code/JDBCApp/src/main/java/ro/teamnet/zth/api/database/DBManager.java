package ro.teamnet.zth.api.database;

import java.lang.reflect.Field;
import java.sql.*;

/**
 * Created by Ana.Diaconu on 13-Jul-17.
 */
public class DBManager {
    public DBManager() {
        throw new UnsupportedOperationException();
    }
    final static String CONNECTION_STRING= "jdbc:oracle:thin:@" + DBProperties.IP + ":" + DBProperties.PORT+":xe";

    private static void registerDriver(){
        try {
            Class.forName(DBProperties.DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        registerDriver();
        try {
            return DriverManager.getConnection(CONNECTION_STRING, DBProperties.USER, DBProperties.PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int checkConnection (Connection connection){
        try {
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("SELECT 1 FROM DUAL");
            while (rs.next())
                return (rs.getInt("1"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
