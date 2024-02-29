package OOPs;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CASE - 1
		
//		P obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();
		
//		CASE - 2
		
//		P obj=new C();
//		System.out.println(obj.d);//P
//		System.out.println(obj.d1);//P
//		System.out.println(((C)(obj)).d2);//C this is called typecast 
//		System.out.println(((C)(obj)).d);//C
//		obj.fun();//C because jiska new kiya hai(C) uske blue print m jakr check krenge agar vo method exist krta hai to vhi print ho jaaega and on the call time P is running
//		obj.fun1();
//		((C)(obj)).fun2();

		
//		CASE - 3
		
//		C obj=new P();   //not valid
		
		
		
//		CASE - 4
		
		C obj=new C();
		System.out.println(obj.d); // C because obj is of C type
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		

		
	}

}
