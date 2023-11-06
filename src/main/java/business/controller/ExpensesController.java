package business.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRequest;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import presistence.DAO.ExpensesDAO;

import java.util.List;

import business.model.Expense;

@Path("/expenses")
public class ExpensesController {

	private ExpensesDAO expensesDAO = new ExpensesDAO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Expense> getExpenses()
	{
		System.out.println("Hello");
		return expensesDAO.readAll();
	}
}
