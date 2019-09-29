package leetcode.study;

/**
 * 最长公共前缀
 *编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 **/
public class LeetCode14 {
    public String longestCommonPrefix(String[] strs) {
        //边界条件判断, 获取字符串数组: .length
        if(strs.length == 0){
            return "";
        }

        //找出长度最短的字符串, 获取字符串长度: .length()
        int minLength = strs[0].length();
        for(String str:strs){
            if(minLength > str.length()){
                minLength = str.length();
            }
        }

        //遍历minLengthString每一个字符, 内部循环遍历每一个单词对应的字符是否相同
        for(int i =0; i < minLength; ++i){
            for(String str : strs){
                //以数组中第一个单词作为基准, 取出第一个单词的对应坐标的字符 和所有字符串的对应坐标的字符进行比较
                if(strs[0].charAt(i) != str.charAt(i)){
                    return strs[0].substring(0, i);
                }
            }
        }

        //返回字符串数组中, 长度最小的字符串
        return strs[0].substring(0, minLength);
    }
}
