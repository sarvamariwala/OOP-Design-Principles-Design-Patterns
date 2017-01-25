interface Printable
{  
	void print();  
}  
interface Showable
{  
	void show();  
}  
class Interface implements Printable,Showable
{  
	public void print()
	{
		System.out.println("Hello");
	}  	
	public void show()
	{
		System.out.println("Maruti Tech");
	}  
	public static void main(String args[])
	{
		Interface obj = new Interface();  
		obj.print();  
		obj.show();  
	}  
}  