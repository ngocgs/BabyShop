/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baby.shop.da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nguye
 */
public class DBConnection {

    private static Connection connection;

    static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection == null) {
            //1.loading driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            //2.Connects
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Data", "sa","sa");
        }
        
        
        
        return connection;

    }

}
