package recursion;

public class return_first_index {

	public static void main(String[] args) {
		int[] arr= {2,3,7,2,5,7,9,7};
		int item =7;
		System.out.println(indx(arr,item,0));
	}
	private static int indx(int[] arr,int item,int i) {
		if(i==arr.length)
			return -1;
		if(arr[i]==item) {
			return i;
		}
		return indx(arr,item,i+1);
	}

}
