class Encapsulate
{
	private String name;
	private int id;
	private int age;
	
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public void setAge(int Age) 
	{
      this.age = Age;
    }
   public void setName(String Name)
   {
      this.name = Name;
   }
   public void setId(int id) 
   {
      this.id = id;
   }
}
public class Runencapsulat 
{
   public static void main(String args[]) 
   {
      Encapsulate encap = new Encapsulate();
      encap.setName("sarvam");
      encap.setAge(23);
      encap.setId(99);
      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
   }
}