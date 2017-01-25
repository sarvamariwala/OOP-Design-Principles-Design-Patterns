interface Vehicle 
{
	void start();
}
class Car implements Vehicle 
{
	public void start() 
	{
		System.out.println("Travel by Car");
    }
}
class Bike implements Vehicle
{
    public void start() 
	{
		System.out.println("Travel by Bike");
    }
}
class Coupling 
{
	public static void main(String[] args)
	{
		Vehicle v = new Car();
		Vehicle b = new Bike();
		v.start();
		b.start();
	}
} 