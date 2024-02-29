package OOPs;

public class construct {
//	constructor has no return type  we can not create a constructor in private class and the name of the main class is the name of constructor
//	class k data member ko initialise krne m help krta hai 
//	class k data member hote hai class k andr bnaye hue variable as name and age in this class
	private String name;
	private int age;
//	after making the data element of the class private we can not access or modify the name and age in client file or external file
	
	
////this is non parameteriazed constructor
//	public construct(){
//		this.name="Divyanshu";
//		this.age=19;
//	}
	
	
	
//	this is the default constructor
//	public construct(){
//		
//	}
	
	
	public void fun() {
		String name="PAnchi";
		int aadhar=902334;
		System.out.println(this.name+" "+this.age+" "+aadhar);
	}
	public construct(String name,int age){
		this.name=name;
		this.age=age;
//		this is parameteriazed constructor
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return this.name;
	}
	public int  getAge() {
		return this.age;
	}
	
	
}
