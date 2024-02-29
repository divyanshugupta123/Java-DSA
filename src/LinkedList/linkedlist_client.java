package LinkedList;

import java.awt.DisplayMode;

public class linkedlist_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		linkedlist ll = new linkedlist();
//		ll.AddFirst(3);
//		ll.AddFirst(-3);
//		ll.AddFirst(1);
//		ll.AddFirst(30);
//		ll.Display();
//		ll.AddLast(34);
//		ll.Display();
//		ll.AddAtIndex(-7, 0);
//		ll.Display();
//		System.out.println(ll.getatIndex(2));
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.removefirst());
//		ll.Display();
		ll.AddLast(4);
		ll.AddLast(45);
		ll.AddLast(34);
		ll.Display();
//		System.out.println(ll.GetNode(0));
		System.out.println(ll.removefirst());
		ll.Display();
		
	}

}
