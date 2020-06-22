public class searchBST {
    static boolean searchBST(TreeNode root, int target){
        if(root == null){
            return false;
        }
        if(target<root.val){
            return searchBST(root.left, target);
        }else if(target>root.val){
            return  searchBST(root.right, target);
        }else
            return true;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode();
        root.val = 4;
        TreeNode rootLeft =new TreeNode();
        rootLeft.val = 2;
        TreeNode rootRight =new TreeNode();
        rootRight.val = 6;
        TreeNode node1 = new TreeNode();
        node1.val = 1;
        TreeNode node2 = new TreeNode();
        node2.val = 3;
        TreeNode node3 = new TreeNode();
        node3.val = 5;
        TreeNode node4 = new TreeNode();
        node4.val = 9;
        root.left = rootLeft;
        root.right = rootRight;
        rootLeft.left = node1;
        rootLeft.right = node2;
        rootRight.left = node3;
        rootRight.right = node4;
        System.out.println(searchBST(root, 6));
        System.out.println(searchBST(root, 7));
    }
}
