package presistence.daoLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import business.model.user.User;
import presistence.DatabaseConnection;

public class UserDAO {
	
	public void createUser(User user)
	{
		String insert = "INSERT INTO User (firstname, lastname, DOB, email, password) VALUES (?,?,?,?,?)";
		
		try(Connection conn = DatabaseConnection.connect(); PreparedStatement statement = conn.prepareStatement(insert))
		{
			statement.setString(1, user.getFirstname());
			statement.setString(2, user.getLastname());
			statement.setString(3, user.getDOB());
			statement.setString(4, user.getEmail());
			statement.setString(5, user.getPassword());
			statement.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
