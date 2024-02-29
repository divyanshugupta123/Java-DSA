package OOPs;

public class Student_client {

	public static void main(String[] args) {
		Student s=new Student();
		Student s1=new Student();
//		the stu_client class depends on student class the blueprint of this class is reach to the heap 
		s.age=20;
		s.name="Divyanshu";
		//System.out.println(s.name+" "+s.age);
		s.introduceYourself();
		
	}

}
