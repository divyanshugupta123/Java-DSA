package Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import Binary_Tree._1_implementation_of_BT.Node;

public class _14_levelOrder_traversal {

	public class Node{
		int data;
		Node left;
		Node right;
	}
	private static Node root;
	public _14_levelOrder_traversal() {
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
	public static void levelOrder() {
		Queue<Node> q = new LinkedList<>();
		Queue<Node> helper = new LinkedList<>();
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ll = new ArrayList<>();
		
		q.add(root);
		while(!q.isEmpty()) {
			Node rv = q.remove();
//			System.out.print(rv.data+" ");
			ll.add(rv.data);
			if(rv.left!=null) {
				helper.add(rv.left);
				
			}
			if(rv.right!=null) {
				helper.add(rv.right);
			}
			if(q.isEmpty()) {
				q = helper;
				helper = new LinkedList<>();
//				System.out.println();
				ans.add(ll);
				ll = new ArrayList<>();
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		_14_levelOrder_traversal lst = new _14_levelOrder_traversal();
		levelOrder();
	}
}
