package Lec12;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=10; // this is a Wrapper class which store in the heap memory
		int a1=10;
//		System.out.println(a);
//		System.out.println(a1);
		a=a1;// AutoBoxing : primitive --> non-primitive
		int b1=-6;
		Integer b=-9009;
		b1=b;// UnBoxing : non-primitive --> primitive
		Integer c1=10;
		Integer c2=10;
		Integer c3=178;
		Integer c4=178;
		System.out.println(c1==c2);//c1 and c2 have same memory address because it is in the range -128 to 127
		System.out.println(c3==c4);//c3 and c4 are not equal because it is out of the range 
		//for Integer , Long and Short the range is same that is -128 to 127
	}
}
