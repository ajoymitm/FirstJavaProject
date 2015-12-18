package Utilities;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.Statement;

public class Database {

	// Connection object

	static Connection con = null;

	// Statement object

	private static Statement stmt;

	// Constant for Database URL

	String url = "jdbc:oracle:thin:@192.168.124.127:3151/cseqac11";
	String username = "ajoyb";
	String password = "Abyisa#14";

	@Before
	public void setUp() throws Exception {

		try {

			// Make the database connection

			String dbClass = "oracle.jdbc.driver.OracleDriver";

			Class.forName(dbClass).newInstance();

			// Get connection to DB

			Connection con = DriverManager.getConnection(url, username,
					password);

			// Statement object to send the SQL statement to the Database

			stmt = con.createStatement();

		}

		catch (Exception e)

		{

			e.printStackTrace();
		}

	}

	@Test
	public void test() {

		try {

			String query = "select email from cse10g.users where rownum<10";

			// Get the contents of userinfo table from DB

			ResultSet res = stmt.executeQuery(query);

			// Print the result untill all the records are printed

			// res.next() returns true if there is any next record else returns
			// false

			while (res.next())

			{

				System.out.println(res.getString(1));

			}
		}

		catch (Exception e)

		{

			e.printStackTrace();

		}

	}

	@After
	public void tearDown() throws Exception {

		// Close DB connection

		if (con != null) {

			con.close();

		}

	}

}
