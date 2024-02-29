package LinkedList_Practice;

public class linkee_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Linkee ll = new Linkee();
		ll.addfirst(10);
		ll.addfirst(20);
		ll.addfirst(30);
		ll.addfirst(40);
//		ll.display();
		ll.addlast(50);
		ll.addlast(60);
//		ll.display();
//		System.out.println(ll.removefirst());
//		System.out.println(ll.removelast());
//		System.out.println(ll.getatanyindex(3));
//		ll.display();
		ll.addatanyindex(70, 3);
//		ll.display();
		System.out.println(ll.removeatanyindex(3));
		ll.display();
	}

}
