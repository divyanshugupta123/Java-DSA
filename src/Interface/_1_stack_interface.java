// 1


package Interface;


//  A
public interface _1_stack_interface extends _4_dynamic_stack_interface,_3_data_structure_interface{
	public void push(int item);
	int pop(int item);		// it is not default it is public because this is a abstract method
	public int peek();
	public static final int x =  9;	
	
	
	
	
	
//	 java 8 features
	default void fun() {
		
	}
	public static int fun1() {
		return 0;
	}
	
	
	
	
//	java 9 features : we can also create a private method also in a interface
	private int fun2() {
		return 0;
	}
	
	
}
