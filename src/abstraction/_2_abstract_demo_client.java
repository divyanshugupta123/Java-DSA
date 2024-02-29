package abstraction;

public class _2_abstract_demo_client {

	public static void main(String[] args) {
//		_1_abstract_demo ab = new _1_abstract_demo();
		_3_payment_demo py = new _3_payment_demo();
		_1_abstract_demo ab = new _1_abstract_demo() {
			
			@Override
			public void payment() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}

}
