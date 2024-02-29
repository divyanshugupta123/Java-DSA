package generics;

public class _1_generics_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr = {10,20,30,40,50,60};
		display(arr);
		String [] arr1 = {"divyanshu "+"ram "+"laxman "};
		display(arr1);
		
	}
	
	
//	Generic is not for the primitive DataType
	public static<t> void display(t[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
