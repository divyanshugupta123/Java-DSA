package practice;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,7,8,3,4,2};
		selection_sort(arr);
	}
	private static void selection_sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int a=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[a]) {
					a=j;
				}
			}
			int t = arr[i];
			arr[i]=arr[a];
			arr[a]=t;
		}
		display(arr);
	}
		
	private static void display(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
}
