package Binary_Tree;
//   https://leetcode.ca/all/333.html question link

public class _17_largest_subtree_bst {
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
	    public int isValidBST(TreeNode root) {
	        return validBST(root).size;
	    }
	    public bstPair validBST(TreeNode root) {
	    	if(root == null){
				return new bstPair();
			}
	    	bstPair leftpair = validBST(root.left);
	    	bstPair rightpair = validBST(root.right);
//	    	boolean self = leftpair.isbst && rightpair.isbst && leftpair.max < root.val && root.val<rightpair.min;
	    	bstPair selfpair = new bstPair();
	    	selfpair.max = Math.max(leftpair.max, Math.max(rightpair.max, root.val));
	    	selfpair.min = Math.min(root.val, Math.min(leftpair.min, rightpair.min));
	    	if(leftpair.isbst && rightpair.isbst && leftpair.max < root.val && root.val<rightpair.min) {
	    		selfpair.isbst = true;
	    		selfpair.size = leftpair.size + rightpair.size + 1;
	    		
	    	}
	    	else {
	    		selfpair.isbst = false;
	    		selfpair.size = Math.max(leftpair.size, rightpair.size);
	    	}
	    	return selfpair;
	    }
	}
class bstPair{
	 boolean isbst = true;
	 long min = Long.MAX_VALUE;
	 long max = Long.MIN_VALUE;
	 int size = 0;
}
}
