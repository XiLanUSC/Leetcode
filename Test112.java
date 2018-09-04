
public class Test112 {
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root == null)return false;
		return getSum(root,sum,0);
	}
	private boolean getSum(TreeNode root,int target,int sumNow) {
		if(root.left == null&&root.right == null)
			if(target == sumNow+root.val) {
				return true;
			}else {
				return false;
			}
		sumNow +=root.val;
		boolean rsLeft = false,rsRight = false;
		if(root.left !=null) {
			rsLeft = getSum(root.left,target,sumNow);
		}
		if(root.right!=null) {
			rsRight = getSum(root.right,target,sumNow);
		}
		sumNow -=root.val;
			
		
		return rsLeft||rsRight;
	}
}
