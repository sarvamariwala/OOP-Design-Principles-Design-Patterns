class Student
{  
  void run()
  {
	  System.out.println("Student");
  }  
}   
class Person extends Student 
{  
  void run()
  {
	  System.out.println("Person is a man ");
  }  
  public static void main(String args[])
  {  
    Student s = new Person();
    s.run();  
  }  
}  