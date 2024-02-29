package DSA;
// USING PUSH EFFFICINET
public class stack_using_queue {

	dynamic_queue dq=new dynamic_queue();
	public boolean isEmpty() {
		return dq.isEmpty();
	}
	public int size() {
		return dq.size();	
	}
	public void push(int item) throws Exception {
		dq.Enqueue(item);
	}
	public int pop() throws Exception {
		dynamic_queue hlp=new dynamic_queue();
		while(dq.size()>1) {
			hlp.Enqueue(dq.Dequeue());
			
		}
		int x=dq.Dequeue();
		while(hlp.size()>0) {
			dq.Enqueue(hlp.Dequeue());
		}
		return x;
	}
	public int peek() throws Exception {
		dynamic_queue hlp=new dynamic_queue();
		while(dq.size()>1) {
			hlp.Enqueue(dq.Dequeue());
			
		}
		int x=dq.Dequeue();
		
		while(hlp.size()>0) {
			dq.Enqueue(hlp.Dequeue());
		}
		dq.Enqueue(x);
		return x;
	}
	public static void main(String[] args) throws Exception {
		stack_using_queue st=new stack_using_queue();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
	}
}