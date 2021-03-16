package 算法.leetcode.algorithms.easy;

/**
 * [加一]
 *
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1：
 *
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 *
 * 考点：模拟
 *
 */
public class Leetcode66 {

    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] < 9){
            digits[digits.length - 1] =  digits[digits.length - 1] + 1;
            return digits;
        }
        digits[digits.length - 1] = 0;
        for (int i = digits.length - 2; i >= 0; i --){
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                break;
            }else {
                digits[i] = 0;
            }
        }
        if(digits[0] == 0){
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }
}
