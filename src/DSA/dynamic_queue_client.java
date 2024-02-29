package DSA;

public class dynamic_queue_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		dynamic_queue dq=new dynamic_queue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		System.out.println(dq.Dequeue());
		System.out.println(dq.Dequeue());
		dq.Enqueue(50);
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Enqueue(80);
		dq.display();
	}

}
