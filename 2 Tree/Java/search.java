public class search {
    static boolean search(TreeNode root, int target){
        if(root == null){
            return false;
        }
        if(root.val == target){
            return true;
        }
        boolean check1 = search(root.left, target);
        boolean check2 = search(root.right, target);
        return check1||check2;
    }

    public static void main(String[] args){
        //        TreeNode root = new TreeNode();
//        root.val = 4;
//        TreeNode rootLeft = new TreeNode();
//        rootLeft.val =5;
//        TreeNode rootRight = new TreeNode();
//        rootRight.val = 5;
//        root.left = rootLeft;
//        root.right = rootRight;

//        TreeNode root = new TreeNode();
//        root.val = 3;
//        TreeNode rootLeft =new TreeNode();
//        rootLeft.val = 2;
//        TreeNode rootRight =new TreeNode();
//        rootRight.val = 1;
//        TreeNode node1 = new TreeNode();
//        node1.val = 1;
//        TreeNode node2 = new TreeNode();
//        node2.val = 4;
//        TreeNode node3 = new TreeNode();
//        node3.val = 5;
//        TreeNode node4 = new TreeNode();
//        node4.val = 6;
//        TreeNode node5 = new TreeNode();
//        node5.val = 8;
//        root.left = rootLeft;
//        root.right = rootRight;
//        rootLeft.left = node1;
//        rootLeft.right = node2;
//        node1.left = node3;
//        node1.right = node4;
//        node4.right = node5;

        TreeNode root = new TreeNode();
        root.val = 4;
        TreeNode rootLeft =new TreeNode();
        rootLeft.val = 5;
        TreeNode rootRight =new TreeNode();
        rootRight.val = 5;
        TreeNode node1 = new TreeNode();
        node1.val = 11;
        TreeNode node2 = new TreeNode();
        node2.val = 4;
        TreeNode node3 = new TreeNode();
        node3.val = 6;
        TreeNode node4 = new TreeNode();
        node3.val = 9;
        root.left = rootLeft;
        root.right = rootRight;
        rootLeft.left = node1;
        rootLeft.right = node2;
        rootRight.left = node3;
        rootRight.right = node4;
        System.out.println(search(root, 7));
        System.out.println(search(root, 5));


    }
}
