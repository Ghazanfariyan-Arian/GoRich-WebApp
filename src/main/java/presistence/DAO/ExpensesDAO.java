package presistence.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.model.Expense;
import presistence.DatabaseConnection;

public class ExpensesDAO {
	
	public List<Expense> readAll()
	{
		System.out.println("In ExpensesDAO");
		String command = "SELECT id,title,date,price,category FROM [dbo.Expenses]";
		List<Expense> expenses = new ArrayList<Expense>();
		try(Connection conn = DatabaseConnection.connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(command))
		{
			while(rs.next())
			{
				Expense expense = new Expense();
				expense.setId(rs.getInt("id"));
				expense.setTitle(rs.getString("title"));
				expense.setDate(rs.getString("date"));
				expense.setPrice(rs.getDouble("price"));
				expense.setCategory(rs.getString("category"));
				expenses.add(expense);
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		return expenses;
	}

}
