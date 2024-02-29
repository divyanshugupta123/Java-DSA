package LinkedList;

import LinkedList.linkedlist.Node;

public class LinkedList_Cycle {
	public class Node{
		int val;
		Node next;
		
	}


private Node head;//store the address of first node
private int size;//gives the total number of node
private Node tail;//store the address of last node
	public void Display(){
		Node temp=head;
		while(temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
			
			
		}
		System.out.println(".");
	}
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
	public void createCycle() throws Exception {
		Node nn = GetNode(2);
		this.tail.next = nn;
	}
	
	public Node hasCycle(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}
	public void cycleRemoval1() {
		Node meet = hasCycle(head);
		if(meet == null) {
			return;
		}
		Node curr = head;
		while(curr != null) {
			Node temp = meet;
			while(temp.next != meet) {
				if(temp.next == curr) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			curr = curr.next;
			
		}
	}
	public void CycleRemoval2() {
		Node meet = hasCycle(head);
		if(meet == null) {
			return;
		}
		//cycle ka count
		Node temp = meet;
		int c=1;
		while(temp.next != meet){
			c++;
			temp = temp.next;
		}
//		m length aage jaaega 
		Node fast = head;
		for(int i=1;i<=c;i++) {
			fast = fast.next;
		}
		Node slow = head;
		while(slow.next != fast.next) {
			fast = fast.next;
			slow = slow.next;
			 
		}
		fast.next = null;
		
		
	}
	public void floyedcycleRemover() {
		Node meet = hasCycle(head);
		if(meet == null) {
			return;
		}
		Node fast = meet;
		Node slow = head;
		while(slow.next != fast.next) {
			fast = fast.next;
			slow = slow.next;
			 
		}
		fast.next = null;
		
	}
	
	
	
	
	
	
	
	
	
	
}
