package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _18_implementation_of_tree_using_level_order {
	public class Node{
		int val;
		Node left,right;
	}
	private Node root;
	Scanner sc = new Scanner(System.in);
	public _18_implementation_of_tree_using_level_order() {
		root = createTree();
		
	}
	public Node createTree() {
		int item  = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		root = nn;
		Queue<Node> q = new LinkedList<>();
		q.add(nn);
		while(!q.isEmpty()) {
			Node rv = q.remove();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if(c1!=-1) {
				Node ll = new Node();
				ll.val = c1;
				rv.left = ll;
				q.add(ll);
			}
			if(c2!=-1) {
				Node ll = new Node();
				ll.val = c2;
				rv.left = ll;
				q.add(ll);
			}
		}
		return nn;
	}
	public void preOrder() {
		preOrder(root);
	}
	public void preOrder(Node root) {
		if(root == null) {
			return;
			
		}
		System.out.print(root.val+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void main(String[] args) {
		_18_implementation_of_tree_using_level_order ll = new _18_implementation_of_tree_using_level_order();
		ll.preOrder();
	}
}
