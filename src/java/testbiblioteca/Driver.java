
package testbiblioteca;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {
    
        private static final String URL = "jdbc:mysql://localhost:3306/biblioteca?zeroDateTimeBehavior=convertToNull";
        private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	public Connection getConnection() throws SQLException, ClassNotFoundException {

		Class.forName(JDBC_DRIVER);
		Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                return conn;
        }
		

        public void closeConnection() throws ClassNotFoundException, SQLException {
            Connection conn = null;
            ResultSet rs = null;
            PreparedStatement stmt = null;
            if(rs != null)
                rs.close();
            if(stmt!=null)
                stmt.close();
            if(conn !=null)
                conn.close();
            
        }


    

    
}
