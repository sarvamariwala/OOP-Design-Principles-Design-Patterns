interface Information
{
  static final String language = "Maruti Tech Labs";  
  public void display();
}
class CodeInterface implements Information 
{
  public static void main(String []args)
  {
    CodeInterface obj = new CodeInterface();
    obj.display();
  }  
  public void display()
  {
    System.out.println(language + " is awesome");
  } 
}