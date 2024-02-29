package Binary_Tree;

import Binary_Tree._1_implementation_of_BT.Node;

public class _3_diameter_of_a_BT {

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
	 class Solution{
		 public int diaOfBT(TreeNode root) {
			 if(root == null) {
				 return 0;
			 }
			 int ld = diaOfBT(root.left);
			 int rd = diaOfBT(root.right);
			 int sd = height(root.left) + height(root.right)+2;
			 return Math.max(sd, Math.max(rd, ld));
		 }
		 private int height(TreeNode nn) {
				if(nn == null) {
					return -1;         // if a single node height is 1 then we return 0 or if we want height of a single node is 0 then we return -1
				}
				int left_h = height(nn.left);
				int right_h = height(nn.right);
				return Math.max(left_h, right_h)+1;
			}
	 }
	 

}
