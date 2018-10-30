package com.panthole.leetcode.no9;

/**
 * 9.Palindrome Number
 *
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *
 * Example 1:
 *
 * Input: 121
 * Output: true
 * Example 2:
 *
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Follow up:
 *
 * Could you solve it without converting the integer to a string?
 *
 * 解题思路：
 * 1.input每增加1，循环多一次O(n),input每增加10，循环多一次O(log10(n))
 * 2.时间复杂度O(log10(n))
 * 3.为了避免超出范围，不用将x完全反转，只反转一半，终止就是如果已经反转的部分大于剩余部分
 * 4.如果是偶数可以直接比较rev和x,如果是奇数可以忽略rev最后一位
 */
public class Solution {

    public static boolean isPalindrome(int x){
        if(x<0||(x!=0&&x%10==0)) return false;

        int rev = 0;
        while(x>rev){
            int pop = x%10;
            x/=10;
            rev = rev*10+pop;
        }

        if(rev == x||x ==rev/10)
        {
            return true;
        }else{
            return false;
        }
    }
}
