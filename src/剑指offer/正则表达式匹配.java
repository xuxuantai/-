package 剑指offer;

/**
 * Created by LaoP on 2019/7/1.
 */
public class 正则表达式匹配 {
    public boolean match(char[] str, char[] pattern){
        if(str == null || pattern == null){
            return false;
        }
        return match(str,0,pattern,0);
    }

    private boolean match(char[] str, int i, char[] pattern, int j){
        if(j == pattern.length && i == str.length){
            //str和pattern都遍历完，返回true
            return true;
        }

        if(j < pattern.length && pattern[j + 1] == '*'){
            if(i < str.length && (str[i] == pattern[j] || pattern[j] == '.')){
                //匹配成功,继续遍历
                return match(str, i + 1, pattern, j) || match(str, i, pattern, j + 2);
            }else{
                //匹配失败,继续匹配*之后的，因为*有可能对应了0个字符
                return match(str, i, pattern, j + 2);
            }
        }
        if(i < str.length && (str[i] == pattern[j] || pattern[j] == '.')){
            //字符串未遍历完，且匹配成功,继续遍历
            return match(str, i + 1, pattern, j + 1);
        }
        return false;



    }

}
