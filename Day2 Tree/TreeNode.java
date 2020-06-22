public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

    static int treeHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    static void preorder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    static void postorder(TreeNode root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }

    static int treeSum(TreeNode root) {
        if(root ==null){
            return 0;
        }
        int sum = root.val;
        int a = treeSum(root.left);
        sum = sum+a;
        int b = treeSum(root.right);
        sum = sum +b;
        return  sum;
    }

    public static void  main(String[] args){
        TreeNode root = new TreeNode();
        root.val = 3;
        TreeNode rootLeft =new TreeNode();
        rootLeft.val = 2;
        TreeNode rootRight =new TreeNode();
        rootRight.val = 1;
        TreeNode node1 = new TreeNode();
        node1.val = 1;
        TreeNode node2 = new TreeNode();
        node2.val = 4;
        TreeNode node3 = new TreeNode();
        node3.val = 5;
        TreeNode node4 = new TreeNode();
        node4.val = 6;
        TreeNode node5 = new TreeNode();
        node5.val = 8;

        root.left = rootLeft;
        root.right = rootRight;
        rootLeft.left = node1;
        rootLeft.right = node2;
        node1.left = node3;
        node1.right = node4;
        node4.right = node5;

        System.out.println(treeHeight(root));//5
        preorder(root);//3 2 1 5 6 8 4 1
        System.out.println(" ");
        inorder(root);//inorder  5 1 6 8 2 4 3 1
        System.out.println(" ");
        postorder(root);//postorder 5 8 6 1 4 2 1 3
        System.out.println(" ");
        System.out.println(treeSum(root));//30
    }
}
