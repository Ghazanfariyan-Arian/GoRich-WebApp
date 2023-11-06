package business.model;

public class Expense {
	
	private int id;
	private String title;
	private String date;
	private double price;
	private String category;
	
	public Expense() {}
	
	public Expense(int id, String title, String date, double price, String category) 
	{
		setId(id);
		setTitle(title);
		setDate(date);
		setPrice(price);
		setCategory(category);
	}
	
	// Setters
	
	public void setId(int id)
	{
		if(id >= 0)
		{
			this.id = id;
		}
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	// Getters
	
	public int getId()
	{
		return id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String getCategory()
	{
		return category;
	}
	

}
