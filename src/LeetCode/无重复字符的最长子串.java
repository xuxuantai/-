package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LaoP on 2019/7/11.
 */
public class 无重复字符的最长子串{
    class Solution {
        /**
         * 最优解
         * 设置一个Map记录出现过的字符的位置
         * 滑动窗口,i -> j，每次循环调整j
         * 如果遇到已存在于map的字符，则i置为在map中该字符的位置 + 1
         */
        public int lengthOfLongestSubstring(String s) {
            int maxLen = 0;
            //设置一个map，key存储每个出现过的字符，value存储它的位置。
            HashMap<Character,Integer> map = new HashMap<>();
            for (int i = 0, j = 0; j < s.length(); j++) {
                if(map.containsKey(s.charAt(j))){
                    //当第j个字符存在于map中时，将滑动窗口头部i向后推至map中该字符的所在位置 + 1。
                    i = Math.max(map.get(s.charAt(j)) + 1, i);
                }
                //在map中保存该字符位置
                map.put(s.charAt(j), j);
                maxLen = Math.max(maxLen, j - i + 1);
            }
            return maxLen;
        }


//        public int lengthOfLongestSubstring(String s) {
//            int maxLen = 0;
//            Set<Character> set = new HashSet<>();
//            for (int i = 0, j = 0; j < s.length(); ) {
//                if(!set.contains(s.charAt(j))){
//                    set.add(s.charAt(j));
//                    maxLen = Math.max(maxLen,j - i + 1);
//                    j++;
//                }else {
//                    set.remove(s.charAt(i));
//                    i++;
//                }
//            }
//            return maxLen;
//        }

//        public static void main(String[] args) {
//            Solution solution = new Solution();
//            System.out.print(solution.lengthOfLongestSubstring("pwwkew"));
//        }


    }
}

