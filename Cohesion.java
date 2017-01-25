class Cohesion
{
    public static void main(String args[])
	{
		Cohesion myObj = new Cohesion();
		System.out.println(myObj.SumOfTwoNumbers(5,7));
	}     
	public int SumOfTwoNumbers(int a, int b)
	{ 
		return (a+b);
	}
}
