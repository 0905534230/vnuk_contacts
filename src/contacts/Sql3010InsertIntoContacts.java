package contacts;

import java.sql.Connection;
import java.sql.SQLException;

public class Sql3010InsertIntoContacts {
	private final Connection connection;
	private final String sqlQuery;
	
	public Sql3010InsertIntoContacts(Connection connection) {
		this.connection = connection;
		
		this.sqlQuery = "INSERT INTO contacts (name, email, address, date_of_register) "
				+ 	"values "
				
				+ 	"('Hoang Quan', 'quan/hoang170203@vnuk.edu.vn', '103NguyenSang', '123' ), "
				+ 	"('Hoang Luyn', 'luyn.hoang@gmail.com', '103 Trieu Nu Vuong-Da Nang', '321' )"
				+ ";"
			;
	}
	
	public void run() throws SQLException {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(">  Sql3010InsertIntoContacts started");
		
		try {
	        connection.prepareStatement(sqlQuery).execute();
	        System.out.println("   DATA successfully loaded in \'contacts\'");
		
		}
		
		catch (Exception e) {
	        e.printStackTrace();
	        connection.close();
		}
		
		finally {
			System.out.println("<  Sql3010InsertIntoContacts ended");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
		}
			
	}
}