// @2a overriding - Example

public class Product 
{

	int id;
	String name;
	
	public Product(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

	
	
	
	public static void main(String[] args) 
	{
		Product p = new Product(1001,"Lenovo");
		System.out.println(p);
//		int memoryl=p.hashCode();
//		System.out.println(memoryl);
		System.out.println(p.hashCode());
		
		
	}
	
	
	
	
}
