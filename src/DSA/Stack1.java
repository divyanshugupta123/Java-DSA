package DSA;

public class Stack1 {
	protected int[] arr;
	int tos; // refer to index
	public Stack1(){
		arr=new int[5];
		tos=-1;	
	}
	public Stack1(int n){
		arr=new int[n];
		tos=-1;
	}
	public boolean isEmpty(){
		return tos==-1;
		
	}
	public boolean isFull(){
		return tos==arr.length-1;
	}
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Array is full");
		}
		tos++;
		arr[tos]=item;
	}
	public int size() {
		return tos+1;
	}
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Empty array");
		}
		int x=arr[tos];
		tos--;
		return x;
	}
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int x=arr[tos];
		return x;
	}
	public void display(){
		for(int i=0;i<=tos;i++) {
			System.out.print(arr[i]+"-->");
		}
		System.out.println(".");
	}
}
