interface Shape
{
   public void draw();
}
class Rectangle implements Shape
{
	public void draw() 
	{
		System.out.println("Inside Rectangle::draw() method.");
	}
}
class Square implements Shape 
{
    public void draw() 
   {
		System.out.println("Inside Square::draw() method.");
   }
}
class Circle implements Shape 
{
   public void draw() 
  {
		System.out.println("Inside Circle::draw() method.");
  }
}
interface Color
{
   public void fill();
}
class Red implements Color 
{
    public void fill() 
   {
		System.out.println("Inside Red::fill() method.");
   }
}
class Green implements Color 
{
  public void fill() 
  {
      System.out.println("Inside Green::fill() method.");
  }
}
class Blue implements Color 
{
    public void fill() 
   {
		System.out.println("Inside Blue::fill() method.");
   }
}
abstract class AbstractFactory 
{
   abstract Color getColor(String color);
   abstract Shape getShape(String shape) ;
}
class ShapeFactory extends AbstractFactory 
{	
    Shape getShape(String shapeType)
   {
      if(shapeType == null)
	  {
         return null;
      }		
      if(shapeType.equalsIgnoreCase("CIRCLE"))
	  {
         return new Circle();     
      }else if(shapeType.equalsIgnoreCase("RECTANGLE"))
	  {
         return new Rectangle();   
      }else if(shapeType.equalsIgnoreCase("SQUARE"))
	  {
         return new Square();
      }
      return null;
   }
   Color getColor(String color) 
   {
      return null;
   }
}
class ColorFactory extends AbstractFactory 
{
   Shape getShape(String shapeType)
  {
		return null;
  }
  Color getColor(String color) 
  {
      if(color == null)
	  {
		return null;
      }		
      if(color.equalsIgnoreCase("RED"))
	  {
         return new Red();
      }else if(color.equalsIgnoreCase("GREEN"))
	  {
         return new Green();
      }else if(color.equalsIgnoreCase("BLUE"))
	  {
         return new Blue();
      }
      return null;
   }
}
class FactoryProducer 
{
    static AbstractFactory getFactory(String choice)
   {
      if(choice.equalsIgnoreCase("SHAPE"))
	  {
         return new ShapeFactory();
         
      }else if(choice.equalsIgnoreCase("COLOR"))
	  {
         return new ColorFactory();
      }
      return null;
   }
}
class AbstractFactoryDemo 
{
   public static void main(String[] args) 
   {

      AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

      Shape shape1 = shapeFactory.getShape("CIRCLE");

      shape1.draw();

      Shape shape2 = shapeFactory.getShape("RECTANGLE");

      shape2.draw();
      
      Shape shape3 = shapeFactory.getShape("SQUARE");

      shape3.draw();

      AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

      Color color1 = colorFactory.getColor("RED");

      color1.fill();

      Color color2 = colorFactory.getColor("Green");

      color2.fill();

      Color color3 = colorFactory.getColor("BLUE");

	  color3.fill();
   }
}