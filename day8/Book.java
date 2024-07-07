// @3 Hash-Map

public class Book 
{

	int bid;
	String bname;
	float price;
	
	public Book(int bid, String bname, float price) {
		
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}
	
	
	void disp()
	{
		System.out.println(bid+bname+price);
	}
}
