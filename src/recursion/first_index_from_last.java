package recursion;

public class first_index_from_last {

	public static void main(String[] args) {
		int[] arr= {2,3,7,2,5,7,9,7};
		int item =7;
		System.out.println(indx(arr,item,arr.length-1));
	}
	private static int indx(int[] arr,int item,int i) {
		if(i==0)
			return -1;
		if(arr[i]==item) {
			return arr.length-i-1;
		}
		return indx(arr,item,i-1);
	}

}