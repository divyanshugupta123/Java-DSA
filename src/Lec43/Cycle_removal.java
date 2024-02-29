package Lec43;


public class Cycle_removal {

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}

	}

	private Node head;
	private int size;
	private Node tail;

	public void addfrist(int item) {

		Node nn = new Node(item);
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;

		} else {
			nn.next = this.head;
			this.head = nn;
			this.size++;

		}

	}
	public void CreateCycle() {
		// this.tail.next = this.head.;// circular
		this.tail.next = this.head.next.next;// cycle
	}

	public void Display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}
	public Node hasCycle() {
		Node fast = this.head;
		Node slow = this.head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				return slow;
			}

		}

		return null;

	}
	public void main(String[] args) {
		Cycle_removal cl = new Cycle_removal();
		cl.addfrist(50);
		cl.addfrist(40);
		cl.addfrist(30);
		cl.addfrist(20);
		cl.addfrist(10);
//		cl.addlast(6);
//		cl.addlast(7);
//		cl.addlast(8);
		cl.CreateCycle();
		Node meetup = hasCycle();
		System.out.println(meetup.data);
//		cl.fylodcycleremoval();
//		cl.Display();
	}

}