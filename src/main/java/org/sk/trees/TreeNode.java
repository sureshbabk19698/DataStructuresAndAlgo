package org.sk.trees;

public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public TreeNode getLeft() {
		return this.left;
	}
	
	public TreeNode getRight() {
		return this.right;
	}

	
	public TreeNode addLeft(int val) {
		this.left = new TreeNode(val);
		return this.left;
	}
	
	public TreeNode addRight(int val) {
		this.right = new TreeNode(val);
		return this.right;
	}

	public TreeNode addLeftAndRight(int left, int right) {
		this.left = new TreeNode(left);
		this.right = new TreeNode(right);
		return this;
	}

	@Override
	public String toString() {
		return "TreeNode [val=" + val + "]";
	}

	public static void print(TreeNode root) {
		if (root != null) {
			System.out.println("Current Root : " + root.val);
			if (root.left != null && root.right != null) {
				System.out.println("\t Left : " + root.left.val + "\t Right : " + root.right.val);
			}
			print(root.left);
			print(root.right);
		}
	}

}
