package Binary_Tree;

public class _2_client_BT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1_implementation_of_BT bt = new _1_implementation_of_BT();
		bt.display();
		System.out.println(bt.max());
		System.out.println(bt.hasElement(50));
		System.out.println(bt.hasElement(100));
		// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
	}

}
