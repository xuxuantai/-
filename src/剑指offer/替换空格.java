package ���ݽṹ�㷨;

/**
 * Created by LaoP on 2019/3/5.
 */
public class �滻�ո� {
    /**
     * ��Ŀ����
     ��һ���ַ����еĿո��滻�� "%20"��
     *����˼·
     ���ַ���β����������ַ���ʹ���ַ����ĳ��ȵ����滻֮��ĳ��ȡ�
     ��Ϊһ���ո�Ҫ�滻�������ַ���%20������˵�������һ���ո�ʱ����Ҫ��β��������������ַ���
     �� P1 ָ���ַ���ԭ����ĩβλ�ã�P2 ָ���ַ������ڵ�ĩβλ�á�
     P1 �� P2 �Ӻ���ǰ�������� P1 ������һ���ո�ʱ������Ҫ�� P2 ָ���λ��������� 02%��ע��������ģ������������� P1 ָ���ַ���ֵ��
     �Ӻ���ǰ����Ϊ���ڸı� P2 ��ָ�������ʱ������Ӱ�쵽 P1 ����ԭ���ַ��������ݡ�
     */
    public String replaceSpace(StringBuffer str){
        if(str == null){
            return null;
        }
        int P1 = str.length() - 1;
        for(int i = 0; i <= P1; i++){
            //�ӳ��ַ���
            if (str.charAt(i) == ' ')
                str.append("  ");
        }
        int P2 = str.length() - 1;
        while(P1 >= 0 && P1 < P2){
            char c = str.charAt(P1--);
            if(c == ' '){
                str.setCharAt(P2--,'0');
                str.setCharAt(P2--,'2');
                str.setCharAt(P2--,'%');
            }else{
                str.setCharAt(P2--,c);
            }
        }
        return str.toString();
    }




}
