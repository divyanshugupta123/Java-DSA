package Binary_Tree;

public class _15_delete_node_in_BST {
	 public class TreeNode {
		       int val;
		       TreeNode left;
		       TreeNode right;
		       TreeNode() {}
		       TreeNode(int val) { this.val = val; }
		       TreeNode(int val, TreeNode left, TreeNode right) {
		           this.val = val;
		           this.left = left;
		           this.right = right;
		       }
	}
	 class Solution {
		    public TreeNode deleteNode(TreeNode root, int key) {
		    		
		    	if(root == null) {
		    		return null;
		    	}
		    	
		    	if(root.val < key) {
		    		root.right = deleteNode(root.right, key);
		    	}
		    	else if (root.val>key) {
		    		root.left = deleteNode(root.left, key);
		    		
		    	}
		    	else {

//		    		this help for removing 1 child and 0 child 
		    		
		    		if(root.left == null) {
		    			return root.right;
		    		}
		    		else if(root.right == null) {
		    			return root.left;
		    		}
		    		else {
		    			int max = max(root.left);
		    			root.left = deleteNode(root.left,key);
		    			root.val = max;
		    		}
		    		
		    	}
		    	return root;
		    	
		    	
		    }
		    
		    private int max(TreeNode root) {
		    	if(root == null) {
		    		return Integer.MIN_VALUE;
		    		
		    	}
		    	int right = max(root.right);
		    	return Math.max(right, root.val);
		    }
		    
	} 
}
