package 剑指offer;

/**
 * Created by LaoP on 2019/7/25.
 */
public class 字符串转整数 {
    public int StrToInt(String str) {
        if(str.length() == 0){
            return 0;
        }
        int result = 0;
        str = str.trim();
        boolean isNegative = str.charAt(0) == '-' ? true : false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 0 || c == '-' || c == '+'){
                continue;
            }
            if(c < '0' || c > '9'){
                return 0;
            }
            result = result * 10 + (c - '0');
        }
        return isNegative ? -result : result;
    }
}
