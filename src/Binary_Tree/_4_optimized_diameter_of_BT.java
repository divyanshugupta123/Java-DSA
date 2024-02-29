package Binary_Tree;

public class _4_optimized_diameter_of_BT {
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
		public int diaBT(TreeNode root) {
			return diameter(root).dia;
		}
		public diaPair diameter(TreeNode root) {
			if(root == null) {
				return new diaPair();
			}
			diaPair leftDP = diameter(root.left);
			diaPair rightDP = diameter(root.right);
			int sd = leftDP.height + rightDP.height+2;
			diaPair sdp = new diaPair();
			sdp.dia = Math.max(sd, Math.max(leftDP.dia, rightDP.dia));
			sdp.height = Math.max(leftDP.height, rightDP.height)+1;
			return sdp;
		}
	}
	class diaPair{
		int dia = 0;
		int height = -1;
	}
}
