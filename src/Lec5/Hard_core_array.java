package Lec5;

public class Hard_core_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		System.out.println(arr[0]+" "+arr[1]);
		swap(arr,0,1);
		 System.out.println(arr[0]+" "+arr[1]);
	}
	public static void swap(int a[],int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

}
