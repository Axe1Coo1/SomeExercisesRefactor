package jdbcPractice;

import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static jdbcPractice.Main.getConnection;
import static org.junit.Assert.assertEquals;


public class jdbcTest {
    @Test
    public void connectionTest() throws SQLException {
        String sql = "select * from LR3.aeroport_workers";
        Connection connection = getConnection();
        Statement st = connection.createStatement();
        ResultSet resultSet = st.executeQuery(sql);
        int i = 1;
        while (resultSet.next()) {
            int worker_num = resultSet.getInt("worker_num");
            assertEquals(i, worker_num);
            i++;
        }


    }
}
