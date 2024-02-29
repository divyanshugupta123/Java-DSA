package DSA;

public class reverse_queue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		dynamic_queue dq=new dynamic_queue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.display();
		reverse(dq);
		dq.display();
	}
	public static void reverse(dynamic_queue dq) throws Exception {
		if(dq.isEmpty()) {
			return;
		}
		int x=dq.Dequeue();
		reverse(dq);
		dq.Enqueue(x);
	}

}
