package ��ָoffer;

/**
 * Created by LaoP on 2019/7/1.
 */
public class ������ʽƥ�� {
    public boolean match(char[] str, char[] pattern){
        if(str == null || pattern == null){
            return false;
        }
        return match(str,0,pattern,0);
    }

    private boolean match(char[] str, int i, char[] pattern, int j){
        if(j == pattern.length && i == str.length){
            //str��pattern�������꣬����true
            return true;
        }

        if(j < pattern.length && pattern[j + 1] == '*'){
            if(i < str.length && (str[i] == pattern[j] || pattern[j] == '.')){
                //ƥ��ɹ�,��������
                return match(str, i + 1, pattern, j) || match(str, i, pattern, j + 2);
            }else{
                //ƥ��ʧ��,����ƥ��*֮��ģ���Ϊ*�п��ܶ�Ӧ��0���ַ�
                return match(str, i, pattern, j + 2);
            }
        }
        if(i < str.length && (str[i] == pattern[j] || pattern[j] == '.')){
            //�ַ���δ�����꣬��ƥ��ɹ�,��������
            return match(str, i + 1, pattern, j + 1);
        }
        return false;



    }

}
