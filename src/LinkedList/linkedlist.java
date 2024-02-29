package LinkedList;

public class linkedlist {
	public class Node{
		int val;
		Node next;
		
	}
	private Node head;//store the address of first node
	private int size;//gives the total number of node
	private Node tail;//store the address of last node
	public void AddFirst(int item) {
		Node nn = new Node();
		nn.val=item;
		if(size==0) {
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
	public void Display(){
		Node temp=head;
		while(temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
			
			
		}
		System.out.println(".");
	}
	public void AddLast(int item) {
		if(size==0) {
			AddFirst(item);
		}
		else {
			Node nn= new Node();
			nn.val=item;
			tail.next=nn;
			tail=nn;
			size++;
		}
	}
	public Node GetNode(int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("Out of Range");
		}
		Node temp=head;
		for(int i=1;i<=k;i++) {
			temp=temp.next;
		}
		return temp;
	}
	public void AddAtIndex(int item,int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("Out of Range");
		}
		if(k==0) {
			AddFirst(item);
		}
		else if(k==size) {
			AddLast(item);
			
		}
		else {
			Node nn=new Node();
			nn.val=item;
			Node k_1th = GetNode(k-1);
			Node kth = GetNode(k);
			k_1th.next=nn;
			nn.next=kth;
			size++;
			
		}
	}
	public int getFirst() {
		return head.val;
	}
	public int getLast() {
		return tail.val;
	}
	public int getatIndex(int k) throws Exception {
		return GetNode(k).val;
	}
	public int removefirst() throws Exception {
		if(size==0) {
			throw new Exception("Linkedlist is empty");
		
		}
		int rv=head.val;
		if(size==1) {
			head=null;
			tail=null;
			size--;
		}
		else {
			Node temp = head;
			head= head.next;
			temp.next=null;
			size--;
			
		}
		return rv;
		
	}
	public int removelast() throws Exception {
		if(size==0) {
			throw new Exception("Linkedlist is empty");
		}
		if(size==1) {
			return removefirst();
		}
		else {
			int rv=tail.val;
			Node nn=GetNode(size-2);
			tail=nn;
			tail.next=null;
			size--;
			return rv;
		}
	}
	public int removeAtIndex(int k) throws Exception {
		if(size==0) {
			throw new Exception("Linkedlist is empty");
		}
		if(k==0) {
			return removefirst();
		}
		else if(k==size-1) {
			return removelast();
			
		}
		else {
			Node k_1thnode = GetNode(k-1);
			Node kthnode = k_1thnode.next;
			k_1thnode.next=kthnode.next;
			kthnode.next=null;
			size--;
			return kthnode.val;
			
		}
	}
	
}




























