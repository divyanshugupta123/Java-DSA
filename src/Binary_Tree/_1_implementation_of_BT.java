package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//import org.w3c.dom.Node;

public class _1_implementation_of_BT {

	public class Node{
		int data;
		Node left;
		Node right;
	}
	private Node root;
	public _1_implementation_of_BT() {
		root = createtree();
	}
	Scanner sc = new Scanner(System.in);
	
	private Node createtree() {
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		boolean hlc = sc.nextBoolean();  // hlc = has left child
		if(hlc == true) {
			nn.left = createtree();
		}
		boolean hrc = sc.nextBoolean();  // hrc = has right child
		if(hrc == true) {
			nn.right = createtree();
		}
		return nn;
	}
	public void display() {
		display(root);
	}
	private void display(Node nn) {
		if(nn == null) {
			return;
		}
		String s = "";
		s = "<-- "+nn.data+" -->";
		if(nn.left!=null) {
			s = nn.left.data+s;
		}
		else {
			s = "."+s;
		}
		if(nn.right!=null) {
			s = s+ nn.right.data;
		}
		else {
			s = s+".";
		}
		System.out.println(s);
		display(nn.left);
		display(nn.right);
	}
	public int max() {
		return max(root);
	}
	private int max(Node nn) {
		if(nn == null) {
			return Integer.MIN_VALUE;
		}
		int left = max(nn.left);
		int right = max(nn.right);
		return Math.max(nn.data, Math.max(right, left));
		
	}
	public boolean hasElement(int ele) {
		return hasElement(root,ele);
	}
	private boolean hasElement(Node nn, int ele) {
		if(nn == null) {
			return false;
		}
		if(nn.data == ele) {
			return true;
		}
		boolean left = hasElement(nn.left,ele);
		boolean right = hasElement(nn.right,ele);
		return left || right;
	}
	public int maxHeight() {
		return maxHeight(root);
	}
	private int maxHeight(Node nn) {
		if(nn == null) {
			return -1;         // if a single node height is 1 then we return 0 or if we want height of a single node is 0 then we return -1
		}
		int left_h = maxHeight(nn.left);
		int right_h = maxHeight(nn.right);
		return Math.max(left_h, right_h)+1;
	}
	private void preOrder(Node nn) {
		if(nn==null) {
			return;
		}
		System.out.println(nn.data);
		preOrder(nn.left);
		preOrder(nn.right);
		
	}
	public void preOrder() {
		preOrder(root);
		System.out.println();
	}
	private void postOrder(Node nn) {
		if(nn == null) {
			return;
		}
		postOrder(nn.left);
		postOrder(nn.right);
		System.out.println(nn.data);
	}
	public void postOrder() {
		postOrder(root);
	}
	public void inOrder() {
		inOrder(root);
	}
	private void inOrder(Node nn) {
		if(nn == null) {
			return;
		}
		inOrder(nn.left);
		System.out.println(nn.data);
		inOrder(nn.right);
	}
	
	public void levelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node rv = q.remove();
			System.out.println(rv.data);
			if(rv.left!=null) {
				q.add(rv.left);
				
			}
			if(rv.right!=null) {
				q.add(rv.right);
			}
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
