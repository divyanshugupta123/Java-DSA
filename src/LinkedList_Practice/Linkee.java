package LinkedList_Practice;

public class Linkee {
	public class Node{
		int data;
		Node next;
	}
	private Node tail;
	private int size;
	private Node head;
	public void addfirst(int ele) {
		Node nn = new Node();
		nn.data=ele;
		if(this.size==0) {
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else {
			nn.next=head;
			head=nn;
			this.size++;
		}
	}
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void addlast(int item) {
		if(this.size==0) {
			addfirst(item);
		}
		else {
			Node nn = new Node();
			nn.data=item;
			this.tail.next=nn;
			this.tail=nn;
			this.size++;
		}
	}
	public int getfirst() {
		return head.data;
	}
	public int getlast() {
		return tail.data;
	}
	public Node getnode(int k) {
		Node temp=head;
		for(int i=0;i<k;i++) {
			temp=temp.next;
		}
		return temp;
	}
	public int removefirst() throws Exception {
		if(this.size==0) {
			throw new Exception("LinkedList is empty");
		}
		int temp=this.head.data;
		if(this.size==1) {
			
			this.head=null;
			this.tail=null;
			this.size--;
//			return temp;
		}
		else {
			Node t=this.head.next;
			this.head.next=null;
			this.head=t;
			this.size--;
		}
		return temp;
	}
	public int removelast() throws Exception {
		if(this.size==0) {
			throw new Exception("LinkedList is Empty");
		}
		int temp=this.tail.data;
		if(this.size==1) {
			return removefirst();
		}
		else {
			Node t = getnode(this.size-2);
			t.next=null;
			tail=t;
			this.size--;
		}
		return temp;
	}
	public int getatanyindex(int k) {
		return getnode(k).data;
	}
	public void addatanyindex(int item,int k) throws Exception {
		if(k<0 || k>size) {
			throw new Exception("K is not valid in range");
		}
		if(k==0) {
			addfirst(item);
		}
		else if(k==size) {
			addlast(item);
		}
		else {
			Node nn = new Node();
			nn.data=item;
			Node k_1th=getnode(k-1);
			Node tee = k_1th.next;
			k_1th.next=nn;
			nn.next=tee;
			this.size++;
		}
	}
	public int removeatanyindex(int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("The value of k is invalid");
		}
		if(k==0) {
			return removefirst();
		}
		else if(k==size-1) {
			return removelast();
		}
		else {
			Node kth = getnode(k);
			int val = kth.data;
			Node k_1th = getnode(k-1);
			k_1th.next=kth.next;
			kth.next=null;
			this.size--;
			return val;
		}
	}
}
