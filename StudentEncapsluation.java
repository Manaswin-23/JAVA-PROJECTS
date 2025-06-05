package demo;

public class StudentEncapsluation {
	private String Name;
	private int ID;
	private int Marks;
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		this.Name=name;
	}
	public int getID()
	{
		return ID;
	}
	public void setID(int roll)
	{
		this.ID=roll;
	}
	public int getMarks()
	{
		return Marks;
		
	}
	public void setMarks(int marks)
	{
		this.Marks=marks;
	}
	public String checkresult()
	{
		if(Marks>40)
		{
			return "pass";
		}
		else
		{
		return "fail";
	}
	}
	public void Display()
	{
		System.out.println("Student name:"+getName());
		System.out.println("student roll:"+getID());
		System.out.println("marks:"+getMarks());
		System.out.println(checkresult());
		
	}
	public static void main(String[] args) {
		StudentEncapsluation s=new StudentEncapsluation();
		s.setName("sai");
		s.setID(227013340);
		s.setMarks(50);
		s.Display();
		s.checkresult();

	}

}
