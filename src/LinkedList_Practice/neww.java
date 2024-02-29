package LinkedList_Practice;

import LinkedList_Practice.Linkee.Node;

public class neww {

	
	public class Linkeed {
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
		public Node getnode(int k) {
			Node temp=head;
			for(int i=0;i<k;i++) {
				temp=temp.next;
			}
			return temp;
		}

	}
}
