package com.panthole.standard;

/**
 * 剑指offer：二叉树的深度
 * 递归解法：
 * （1）如果二叉树为空，二叉树的深度为0
 * （2）如果二叉树不为空，二叉树的深度 = max(左子树深度， 右子树深度) + 1
 * */
public class TreeDepth {
    public int TreeDepth(TreeNode root){
        if(root == null) return 0;
        int left = TreeDepth(root.left) + 1;
        int right = TreeDepth(root.right) + 1;
        return left>right?left:right;
    }
}
