package Lec20;

public class String_Builder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");
//		String builder is much more faster then the string just because the string builder is immutable
		
//		sb is created in the stack
//		new stringBuilder is created in the heap;
		System.out.println(sb.length());
		System.out.println(sb.capacity());
//		capacity is bydefault 16 but when we paas some string there we get string length+16
		sb.append("boi");
		System.out.println(sb);
//		when the size of string is equal to the capacity then it grow 2*(current capacity)+2 
//		if we want to set a character or a string at some specific index we use :
		sb.insert(1,"Divyanshu");
		System.out.println(sb);
		String s=sb.toString();
//		builder to string 
		System.out.println(sb.reverse());
		System.out.println(sb.charAt(3));
		System.out.println(sb.substring(1,3));
		
	}

}
