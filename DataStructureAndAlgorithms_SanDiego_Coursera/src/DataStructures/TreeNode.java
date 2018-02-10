package DataStructures;

public class TreeNode {
	public Object value ;
	public TreeNode right ;
	public TreeNode left ;
	
	public TreeNode(Object val) {
		this.value=val;
	}
	public Boolean isLeaf() {
		if (right == null && left == null) {
			return true;
		} else {
			return false;
		}

	}

}
