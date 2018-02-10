package DataStructures;

public class Tree {
	public TreeNode root;

	public void add(Object current) {
		TreeNode temp = new TreeNode(current);
		if (root == null) {
			root = temp;
		} else {
			TreeNode index = root;
			TreeNode currentParent;
			while (true) {
				currentParent = index;
				if ((int) current < (int) index.value) {
					index = index.left;
					if (index == null) {
						currentParent.left = temp;
						return;
					}
				} else {
					index = index.right;
					if (index == null) {
						currentParent.right = temp;
						return;
					}
				}
			}
		}
	}

	public Boolean isEmpty() {
		if (root == null) {
			return true;
		} else {
			return false;
		}
	}



	public int lenght() {
		int rcounter = 0;
		int lcounter = 0;
		TreeNode temp = root;
		while (temp.right != null) {
			temp = temp.right;
			rcounter++;
		}
		while (temp.right != null) {
			temp = temp.right;
			lcounter++;
		}

		return max(rcounter, lcounter) + 1;
	}

	private int max(int a, int b) {
		if (a > b)
			return a;
		return b;
	}

	public void print(TreeNode x) {
		System.out.println("In Order ");
		printInorder(x);
		System.out.println();
		System.out.println("Pre Order ");
		printPreorder(x);
		System.out.println();
		System.out.println("Post Order ");
		printPostorder(x);
	}

	public void printPreorder(TreeNode x) {
		if (x != null) {
			printPreorder(x.left);
			System.out.print(x.value);
			printPreorder(x.right);
		}
	}

	public void printInorder(TreeNode x) {
		if (x != null) {
			System.out.print(x.value);
			printPreorder(x.left);
			printPreorder(x.right);
		}
	}

	public void printPostorder(TreeNode x) {
		if (x != null) {
			printPreorder(x.left);
			printPreorder(x.right);
			System.out.print(x.value);

		}
	}

}
