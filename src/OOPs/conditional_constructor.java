package OOPs;
//import java.lang.Exception;
public class conditional_constructor {

	private String name="Divyanshu Gupta";
	private int age=20;
	public conditional_constructor(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
//	FIRST METHOD TO GENERATE THE EXCEPTION USING THROWS - TERMINATE THE CODE
	
	public void setAge(int age) throws Exception {
		if(age<0) {
			throw new Exception("Not valid age because age can not be negative");
		}
		this.age = age;
	}
	
//	SECOND METHOD TO GENERATE THE EXCEPTION USING TRY AND CATCH - DOESNOT TERMINATE THE CODE
	
//	public void setAge(int age){
//		try {
//		if(age<0) {
//			throw new Exception("Not valid age because age can not be negative");
//		}
//		} catch(Exception e){
////			System.out.println(e); 
//			e.printStackTrace() ;
//		}
//		finally{
//			System.out.println("Hi");
//		}
//		this.age = age;
//	}
	
	
}