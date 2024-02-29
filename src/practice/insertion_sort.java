package practice;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,9,4,2,10,1,11};
		insertion_sort(arr);
	}
	private static void insertion_sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int item = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			j++;
			arr[j]=item;
		}
		display(arr);
	}
	private static void display(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
