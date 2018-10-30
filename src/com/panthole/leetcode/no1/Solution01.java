package com.panthole.leetcode.no1;

/*
 * 1.Two Sum

 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 * You may assume that each input would have exactly one solution, and you may not use the same element twice.

 * Example:

 * Given nums = [2, 7, 11, 15], target = 9,

 * Because nums[0] + nums[1] = 2 + 7 = 9,

 * return [0, 1].

 * 解题思路：
 * 1.target减去遍历的值求另外一个值
 * 2.HashMap时间复杂度O(n)
 * 3.HashMap只是存储映射，查找遍历还是用int数组，所以两个数不会丢失数字
 * 4.Solution2一次遍历的方法其实是先查找再存储，所以不用判断map.get(nums[i])!=i，如果找到就结束了
 * 5.“the same element twice”这句话的意思并不是不允许有两个一样的元素，而是指每个元素只能用一次
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution01 {

    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i= 0; i<nums.length; i++){
            //并不会导致重复数值的丢失
            map.put(nums[i],i);
        }
        for(int i=0; i<nums.length; i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)&&map.get(nums[i])!=i){
                return new int[]{i,map.get(nums[i])};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,3,2,3};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.print(Arrays.toString(result));
    }
}
