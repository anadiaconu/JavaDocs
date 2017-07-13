package ro.teamnet.zth.api.database;

import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Ana.Diaconu on 13-Jul-17.
 */
public class DBManagerTest {

    @Test
    public void getConnectionTest(){
        try {
            Connection con = DBManager.getConnection();
            assertNotNull(con);
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void checkConnectionTest(){
        Connection con = DBManager.getConnection();
        int r = DBManager.checkConnection(con);
        assertEquals(1, r);
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
