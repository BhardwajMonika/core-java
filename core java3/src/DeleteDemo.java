import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteDemo {

	public static void main(String[] args) 
	{
		Connection con;
		Statement stmt;
		ResultSet rs;
		int cnt=0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
	        con= DriverManager.getConnection("jdbc:MySql://localhost:3307/classicmodels",
					"root","root");
			
		String str = "Delete from offices where city = 'Noida' ";	
					System.out.println(" ");
				stmt=con.createStatement();
				int rowcount = stmt.executeUpdate(str);
				cnt = stmt.executeUpdate(str);
				if(cnt>0)
				{
					System.out.println("Record deleted");
				}
				con.close();
		}
		catch(Exception ce)
		{
			System.out.println(ce);
		}
}
}