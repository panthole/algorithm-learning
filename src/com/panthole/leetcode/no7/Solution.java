package com.panthole.leetcode.no7;

/**
 * 7.Reverse Integer
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 * Input: 123
 * Output: 321
 *
 * Example 2:
 * Input: -123
 * Output: -321
 *
 * Example 3:
 * Input: 120
 * Output: 21
 *
 * Note:
 * Assume we are dealing with an environment which could only store
 * integers within the 32-bit signed integer range: [−231,  231 − 1].
 * For the purpose of this problem, assume that your function
 * returns 0 when the reversed integer overflows.
 *
 * 解题思路：
 * 1.将末尾数弹出并放到首位
 * 2.通过%10取最后一位，通过*放如首位
 * 3.溢出判断，如果再扩大十倍就溢出或者末尾数大于7小于-8(-2147483648,2147483647)
 * 4.时间复杂度O(log10(n)),随着数字每增长10倍，循环增加一次，500到5000只增加了一次循环
 */

public class Solution {
    public static int reverse(int x){
        int rev = 0;
        while(x !=0){
            int pop = x%10;
            x /= 10;
            if(rev >Integer.MAX_VALUE/10 ||(rev ==Integer.MAX_VALUE/10&& pop >7))return 0;
            if(rev <Integer.MIN_VALUE/10 ||(rev ==Integer.MIN_VALUE/10 && pop<-8))return 0;

            rev = rev*10 +pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        int input = -123;
        int output = reverse(input);
        System.out.println(output);
    }
}
