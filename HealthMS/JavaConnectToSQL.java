/* 
package HealthMS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaConnectToSQL {
    public static void main(String[] args){
        String url = "jdbc:sqlserver://localhost\\sql_server;databaseName=HMSystem";
        String user = "LogIN";
        String password = "Programming58";

            try {
             
                Connection connection = DriverManager.getConnection(url, user, password);
                
                System.out.println("Connected to Microsoft SQL Server");

            } catch (SQLException e) {
                System.out.println("Oops there's an error: ");
                e.printStackTrace();
            }

        }
}
*/

