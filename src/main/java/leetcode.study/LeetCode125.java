package leetcode.study;

/**
 * @Classname LeetCode125
 * @Description
 *
给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

说明：本题中，我们将空字符串定义为有效的回文串。

示例 1:

输入: "A man, a plan, a canal: Panama"
输出: true
示例 2:

输入: "race a car"
输出: false
 * @Date 2019/9/26 23:19
 * @Created by xiaoqiang
 */
public class LeetCode125 {
    public static  boolean isPalindrome(String s) {
        //边界条件判断
        if(s == null){
            return false;
        }
        //将不是数字、字母的字符过滤掉， 同时大写字母转小写字母
        s = s.replaceAll("[^0-9a-zA-Z]","").toLowerCase();

        //分别取出第一个字符和最后一个字符作比较，通过charAt()方法
        for(int i = 0, j = s.length() - 1; i < j; i++, j-- ){
            if(s.charAt(i) != (s.charAt(j))){
                return false;
            }
        }
        return true;
    }
}
