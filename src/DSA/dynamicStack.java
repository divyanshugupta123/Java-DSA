package DSA;

public class dynamicStack extends Stack1{
	@Override
	public void push(int item) throws Exception {
		if(this.isFull()) {
			int[] a=new int[2*arr.length];
			for(int i=0;i<arr.length;i++) {
				a[i]=arr[i];
				
			}
			arr=a;
		}
		super.push(item);
//		using super child class use the data from the parent class
	}
}
