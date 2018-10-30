package com.panthole.standard;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 *给定一个二叉树，返回它的 前序 遍历。

 *示例:

 *输入: [1,null,2,3]
 1
 \
 2
 /
 3

 *输出: [1,2,3]
 *进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 * */

public class BinaryBreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode treeNode){
        //注意LinkedList拼写
        List<Integer> res = new LinkedList<>();
        //需要返回res
        if(treeNode ==null) return res;
        //栈存储的是节点
        Stack<TreeNode> stack = new Stack<>();
        stack.push(treeNode);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            res.add(node.val);
            //由于先进后出，所以先右后左
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left !=null){
                stack.push(node.left);
            }
        }
        return  res;
    }
}

 class TreeNode{
   public int val;
   public TreeNode left;
   public TreeNode right;
   public void TreeNode(int val){
       this.val = val;
   }
}