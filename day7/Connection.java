// 4
package day7;

interface connection
{
   public void connect();
}

class Mysql implements connection
{
	public void connect()
	{
		System.out.println("Mysql way of connection with java");
	}
} 

class Oracle implements connection
{
	public void connect()
	{
		System.out.println("Oracle way of connection with java");
	}
} 