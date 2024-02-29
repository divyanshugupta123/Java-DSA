package LinkedList;

public class cycle_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList_Cycle ll = new LinkedList_Cycle();
		ll.AddLast(1);
		ll.AddLast(2);
		ll.AddLast(3);
		ll.AddLast(4);
		ll.AddLast(5);
		ll.AddLast(6);
		ll.AddLast(7);
		ll.AddLast(8);
		ll.createCycle();
//		ll.cycleRemoval1();
		ll.floyedcycleRemover();
		ll.Display();
		
	}

}
