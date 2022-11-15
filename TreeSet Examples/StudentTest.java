
public class StudentTest {
	public static void main(String[] args) {
		
		Student x = new Student(101,"Anirudh",69.0f);
		System.out.println("x "+x);

		ExaminationHall examHall = new ExaminationHall();
		examHall.exam(x);
		examHall.afterExam(x);
				
		System.out.println("x "+x);
	}
}

class ExaminationHall
{
	void exam(Student y) {
		System.out.println("ExaminationHall : Changing y's name....");
		y.name = "ANIRUDH";
	}
	void afterExam(Student z) {
		System.out.println("ExaminationHall  : Changing z's marks....");
		z.marks = 89f;
	}
}
class Student
{
	 int rollno;
	 String name;
	 float marks;
	
	public Student(int rollno, String name, float marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
