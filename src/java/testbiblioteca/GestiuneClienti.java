package testbiblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestiuneClienti {
	
	private static final String URL = "jdbc:mysql://localhost:3306/biblioteca?zeroDateTimeBehavior=convertToNull";
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	public Client getDateClient(int codcli )  {
                
		Client clientulCautat = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {

			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			stmt = conn.createStatement();
			String sql = "SELECT codcli, nume, prenume, datan, email, telefon FROM client WHERE codcli="+codcli+";";
			System.out.println(sql);
			
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				clientulCautat =  new Client();
                                clientulCautat.setCodcli(codcli);
				clientulCautat.setNume(rs.getString("nume"));
				clientulCautat.setPrenume(rs.getString("prenume"));
                                clientulCautat.setDataNastere(rs.getDate("datan"));
				clientulCautat.setEmail(rs.getString("email"));
				clientulCautat.setTelefon(rs.getString("telefon"));
				
			}
				
			
			System.out.println("Cautarea a functionat cu succes.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("NU este OK SQL -ul!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Probleme cu driverul !");
		} 
		return clientulCautat;
	}




	public void stergeClient(int idClient) {
		;
	}

	public void salveazaClient(Client nouclient) {
		;
	}

} 
