package Binary_Tree;

public class _8_sum_root_to_leaf_node {
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
		    public int sumNumbers(TreeNode root) {
		        return number(root,0);
		        
		    }
		    public int number(TreeNode root,int sum) {
		    	if(root == null) {
		    		return 0;
		    	}
		    	if(root.left == null && root.right == null) {
		    		return sum*10+root.val;
		    	}
		    	int left = number(root.left,sum*10+root.val);
		    	int right = number(root.right,sum*10+root.val);
		    	return left+right;
		    	
		    }
		}
}
