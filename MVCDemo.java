class Student 
{
	private String rollno;
	private String name;
	
	public String getRollNo()
	{
		return rollno;
	}
	public void setRollNo(String rollno)
	{
		this.rollno=rollno;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
class StudentView
{
	public void printStudentDetails(String studentName,String studentRollNo)
	{
		System.out.println("Student:-");
		System.out.println("Name:-" + studentName);
		System.out.println("RollNo:-" + studentRollNo);
	}
}
class StudentController 
{
	private Student model;
	private StudentView view;
	public StudentController(Student model, StudentView view)
	{
		this.model = model;
		this.view = view;
	}
	public void setStudentName(String name)
	{
		model.setName(name);		
	}
	public String getStudentName()
	{
		return model.getName();		
	}
	public void setStudentRollNo(String rollNo)
	{
		model.setRollNo(rollNo);		
	}
	public String getStudentRollNo()
	{
		return model.getRollNo();		
	}
	public void updateView()
	{				
		view.printStudentDetails(model.getName(), model.getRollNo());
	}	
}
class MVCDemo 
{
	public static void main(String[] args)
	{
		Student model  = retriveStudentFromDatabase();
		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);

		controller.updateView();	

		controller.setStudentName("John");

		controller.updateView();
	}
	private static Student retriveStudentFromDatabase()
	{
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
    }
}