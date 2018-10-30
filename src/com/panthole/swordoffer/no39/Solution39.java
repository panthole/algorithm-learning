package com.panthole.swordoffer.no39;

import com.panthole.standard.BinaryTreeNode;


/**
 * 题目一：输入一棵二叉树的根结点，求该树的深度。
 * 从根结点到叶子点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * <p>
 * 【解】：递归
 * <p>
 * <p>
 * Created by panthole on 2018/09/13.
 */
public class Solution39 {
    public int TreeDepth(BinaryTreeNode headTreeNode) {
        if (headTreeNode == null)
            return 0;

        int left = TreeDepth(headTreeNode.leftNode);
        int rigth = TreeDepth(headTreeNode.rightNode);

        return left > rigth ? left + 1 : rigth + 1;
    }
}
