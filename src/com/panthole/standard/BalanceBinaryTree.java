package com.panthole.standard;

/**
 * 10. 判断二叉树是不是平衡二叉树
 * LeetCode：Balanced Binary Tree
 * 给定二叉树，确定它是否是高度平衡的。
 * 对于此问题，高度平衡二叉树定义为： 一个二叉树，其中每个节点的两个子树的深度差不相差超过1。
 *
 * 递归解法：
 * （1）如果二叉树为空，返回真
 * （2）如果二叉树不为空，如果左子树和右子树高度相差不大于1且左子树和右子树都是AVL树，返回真，其他返回假
 */
public class BalanceBinaryTree {
    public boolean isBalance(TreeNode root){
        if(root == null) return true;
        return Math.abs((maxHeight(root.left)-maxHeight(root.right)))<=1&&isBalance(root.right)&&isBalance(root.left);
    }

    public int maxHeight(TreeNode root){
        if(root == null) return 0;
        return Math.max(maxHeight(root.left),maxHeight(root.right)) + 1;
    }
}
