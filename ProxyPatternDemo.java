interface Image
{
	void display();
}
class RealImage implements Image
{
	private String fileName;
	
	public RealImage(String fileName)
	{
		this.fileName=fileName;
		loadFromDisk(fileName);
	}
	public void display()
	{
		 System.out.println("Displaying " + fileName);
	}
	private void loadFromDisk(String fileName)
	{
		 System.out.println("loading " + fileName);		
	}
}
class ProxyImage implements Image
{
	private RealImage realimage;
	private String fileName;
	
	public ProxyImage(String fileName)
	{
		this.fileName=fileName;
	}
	public void display()
	{
		if(realimage == null)
		{
			realimage= new RealImage(fileName);
		}
		realimage.display();
	}
}
public class ProxyPatternDemo
{
	public static void main (String args[])
	{
		Image image = new ProxyImage("test.jpg");
		image.display();
		System.out.println("");
		image.display();
	}
}