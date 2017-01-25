class arithmetic
{
	int z;
	public void add(int x,int y)
	{
		z = x + y;
		System.out.println("Sum of two num:-"+z);
	}
	public void substrac(int x,int y)
	{
		z = x - y;
		System.out.println("Substract of two num:-"+z);
	}
}
public class Inheritance extends arithmetic
{
	public void multiplication(int x,int y)
	{
		z = x * y;
		System.out.println("Multiplication of two num:-"+z);
	}
	public static void main(String args[]) {
      int a = 20, b = 10;
      Inheritance demo = new Inheritance();
      demo.add(a, b);
      demo.substrac(a, b);
      demo.multiplication(a, b);
   }
}
