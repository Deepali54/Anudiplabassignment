package lab7;



import java.util.ArrayList;
import java.util.List;

class Student
{
	private int id;
	private String name;
	private int age;
	private float mathsMarks;

	public int getId()
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}        
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	} 
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age= age;
	}                
	
	public float getMarks() {
		return mathsMarks;
	}
	public void setMarks(float marks)
	{
		mathsMarks = marks;
}       
	public Student()
	{
		
	}
	public Student(int id, String name,int age, float marks)
	{
		super(); 
		this.id = id;
		this.name = name;
		this.age =  age;
		mathsMarks = marks;
	}
}

public class stream {

	public static void main(String[] args) {
	
		List<Student> stud=new ArrayList<>();
		stud.add(new Student(1,"deepali",20,77));
		stud.add(new Student(2,"pratik",21,80));
		stud.add(new Student(3,"samu",23,40));
		stud.add(new Student(4,"neha",22,50));
		stud.add(new Student(5,"gauri",26,75));
		
		stud.stream().filter(s->s.getMarks()>=60).forEach(p-> System.out.println(p.getId()+" "+p.getName()+" "+p.getAge()+" "+p.getMarks()));
		Long counter=stud.stream().filter(s->s.getMarks()>60).count();
		System.out.println("count the Total Student to get More than 75 marks :"+counter);
		
	}

	}

