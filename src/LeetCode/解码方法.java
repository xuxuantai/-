package LeetCode;

/**
 * Created by LaoP on 2019/7/9.
 */
public class 解码方法 {
    class Solution {
        public int numDecodings(String s) {
            char[] chars = s.toCharArray();
            if(chars.length == 0){
                return 0;
            }
            int[] dp = new int[chars.length + 1];
            dp[0] = 1;
            for (int i = 1; i < chars.length + 1; i++) {
                //解码前一位的数量
                if(chars[i - 1] != '0'){
                    dp[i] += dp[i - 1];
                }
                //解码前两位的数量
                if(i > 1){
                    int num = (chars[i - 2] - '0') * 10 + (chars[i - 1] - '0');
                    //00 的情况
                    if(num == 0){
                        return 0;
                    }
                    if(num >= 10 && num <= 26){
                        dp[i] += dp[i - 2];
                    }
                }
            }
            return dp[chars.length];
        }
    }
}
