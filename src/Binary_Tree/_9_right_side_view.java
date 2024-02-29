package Binary_Tree;

import java.util.ArrayList;
import java.util.List;

public class _9_right_side_view {
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
			int maxDepth = 0;
		    public List<Integer> rightSideView(TreeNode root) {
		        List<Integer> ll = new ArrayList<>();
		        rightView(root,1,ll);
		        return ll;
		    }
		    public void rightView(TreeNode root , int currlevel , List<Integer> ll) {
		    	if(root == null) {
		    		return;
		    	}
		    	if(maxDepth<currlevel) {
		    		ll.add(root.val);
		    		maxDepth = currlevel;
		    	}
		    	rightView(root.right, currlevel+1, ll);
		    	rightView(root.left, currlevel+1, ll);
		    }
		}
}
