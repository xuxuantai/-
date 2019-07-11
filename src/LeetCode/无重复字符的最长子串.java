package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LaoP on 2019/7/11.
 */
public class ���ظ��ַ�����Ӵ�{
    class Solution {
        /**
         * ���Ž�
         * ����һ��Map��¼���ֹ����ַ���λ��
         * ��������,i -> j��ÿ��ѭ������j
         * ��������Ѵ�����map���ַ�����i��Ϊ��map�и��ַ���λ�� + 1
         */
        public int lengthOfLongestSubstring(String s) {
            int maxLen = 0;
            //����һ��map��key�洢ÿ�����ֹ����ַ���value�洢����λ�á�
            HashMap<Character,Integer> map = new HashMap<>();
            for (int i = 0, j = 0; j < s.length(); j++) {
                if(map.containsKey(s.charAt(j))){
                    //����j���ַ�������map��ʱ������������ͷ��i�������map�и��ַ�������λ�� + 1��
                    i = Math.max(map.get(s.charAt(j)) + 1, i);
                }
                //��map�б�����ַ�λ��
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

