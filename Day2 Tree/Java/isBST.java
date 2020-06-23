public class isBST {
    public static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean checkLeft = true;
        boolean checkRight = true;
        //check left TreeNode is BST or not
        if (root.left != null && root.left.val <= root.val) {
            checkLeft = isValidBST(root.left);
        } else if (root.left != null && root.left.val > root.val) {
            checkLeft = false;
        } else {
        }
        //check right TreeNode is BST or not
        if (root.right != null && root.right.val >= root.val) {
            checkRight = isValidBST(root.right);
        } else if (root.right != null && root.right.val < root.val) {
            checkRight = false;
        } else {
        }
        TreeNode node = root.left;
        TreeNode node1 = root.right;
        if (node != null && node1 != null) {
            while (node.right != null) {
                node = node.right;
            }
            if (node.val > root.val) {
                return false;
            }
            while (node1.left != null) {
                node1 = node1.left;
            }
            if (node1.val < root.val) {
                return false;
            }
        }
        return checkLeft && checkRight;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode();
        root.val = 7;
        TreeNode rootLeft =new TreeNode();
        rootLeft.val = 4;
        TreeNode rootRight =new TreeNode();
        rootRight.val = 13;
        TreeNode node1 = new TreeNode();
        node1.val = 3;
        TreeNode node2 = new TreeNode();
        node2.val = 6;
        TreeNode node3 = new TreeNode();
        node3.val = 5;
        TreeNode node4 = new TreeNode();
        node4.val = 14;
        TreeNode node5 = new TreeNode();
        node5.val = 1;

//        TreeNode root = new TreeNode();
//        root.val = 4;
//        TreeNode rootLeft =new TreeNode();
//        rootLeft.val = 1;
//        TreeNode rootRight =new TreeNode();
//        rootRight.val = 5;
//        TreeNode node1 = new TreeNode();
//        node1.val = 2;
//        TreeNode node2 = new TreeNode();
//        node2.val = 4;
//        TreeNode node3 = new TreeNode();
//        node3.val = 6;
//        TreeNode node4 = new TreeNode();
//        node4.val = 9;

//        TreeNode root = new TreeNode();
//        root.val = 4;
//        TreeNode rootLeft =new TreeNode();
//        rootLeft.val = 1;
//        TreeNode rootRight =new TreeNode();
//        rootRight.val = 5;

        root.left = rootLeft;
        root.right = rootRight;
        rootLeft.left = node1;
        rootLeft.right = node2;
        rootRight.left = node3;
        rootRight.right = node4;
        node1.left = node5;
        System.out.println(isValidBST(root));
    }
}
