package practice;

public class implementationof_Linked_List {

	public class Nod{
		int val;
		Nod next;
		
	}
	private Nod head;
	private Nod tail;
	private int size;
	public void AddFirst(int item) {
		Nod nn=new Nod();
		nn.val=item;
		if(size==0) {
			head=nn;
			tail=nn;
			size++;
			
		}
		else {
			nn.next=head;
			head=nn;
			size++;
		}
	}
	public void display() {
		Nod temp=head;
		while(temp != null) {
			System.out.print(temp.val+"-->");
			temp=temp.next;
			
		}
	}

}
