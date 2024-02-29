package OOPs;

public class Student {
	String name;
	int age;
	public void introduceYourself() {
		String name="Raj";
		System.out.println("My Name is "+name+" and age is "+this.age);
		System.out.println("My Name is "+this.name+" and age is "+this.age);
//	this is a keyword used to store the address of the class data element if local variable and the name of the element of the class is same then without "this" keyword its indicate the memory address of local variable
	}
}
