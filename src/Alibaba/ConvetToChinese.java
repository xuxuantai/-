package Alibaba;

/**
 * Created by XXT on 2019/9/20.
 */

/**
 * �ڰ����ڲ�������Ӧ��������һ������Ӧ�ý�TTS�����ǽ��ı�ת����������������ǵ���è����Ͱ���ͷ�������IVR��Ӧ�ù㷺��
 * �����ʶ���ʱ�򾭳��������ı����а�������������Ҫת�����ĵķ�ʽ�����ʶ���
 *
 * ����˵ 1000������Ҫ�ʶ��� һǧ
 * ����˵ 10002������Ҫ�ʶ��� һ�����
 * ����˵ 3001111����Ҫ�ʶ��� ������һǧһ��һʮһ
 *
 * �����ֱȽϴ��ʱ������ϣ���ܹ��ʶ��ĸ����Ի�һЩ�������м���΢ͣ��һ�¡�
 * ����˵�ղŵ�300 1111������ϣ���ʶ��� ������һǧһ��һʮһ
 * ����˵1682 1234 5678������ϣ���ʶ��� һǧ���ٰ�ʮ���ڣ�һǧ������ʮ������ǧ������ʮ��
 * ͨ�� ���Ķ��� �����һ��ͣ�٣������ʶ�ϰ�ߣ�һ�����ʶ�������������ò�Ҫ����8���֣�����ͽ�������һ��ͣ�١�
 * ���� 10002���Ͳ���Ҫͣ�٣�ֱ�Ӷ���һ�����
 * ���� 11234������Ҫͣ��һ�£���ɣ�һ��һǧ������ʮ��
 *
 * ϣ��ͬѧ����ʵ������һ��ת���ķ�����������������ת�������ģ�ͬʱ���ܿ��ǵ��ʶ���ͣ�����顣
 *
 * ps�����������ֶ�Ӧ�����Ĳο���Ϊ��
 * ��һ�����������߰˾�ʮ
 * ǧ������
 *
 * ps���ٶ����ǵ����ֲ�����һ����
 */
public class ConvetToChinese {
    public static String[] chnPosition = {"", "��","�ڣ�"};
    public static String[] chnMinorPosition = {"","ʮ","��","ǧ"};
    public static String[] chnMinorNum = {"��","һ","��","��","��","��","��","��","��","��"};


    public static String convetToChinese(int num){

        String result = new String();
        String chinese = new String();//���������ַ���
        String str = new String();

        int position = 0;//��λ��ʶ
        boolean zero = false;//�Ƿ���Ҫ����
        while(num > 0){
            int section = num % 10000;//���λ����������
            if(zero){
                //�ж��Ƿ���Ҫ����
                result = "��" + result;
            }

            //�Ե�ǰ���λ����ת����4λ��
            chinese = convetToChinese(section,chinese);

            if(section > 0){
                //����ǽ�λ����Ҫ���Ͻ�λ����
                str = chnPosition[position];
                chinese = chinese + str;
            }
            result = chinese + result;
            zero = (section < 1000) && (section > 0);
            chinese = "";
            num = num / 10000;
            position++;
        }
        return result;
    }

    /**
     * �������ڽ�λ
     * @param section
     * @param chineseNum
     * @return
     */
    public static String convetToChinese(int section, String chineseNum){
        String setionChinese = new String();
        int position = 0;
        boolean zero = true;//4λ���ж��Ƿ���
        while(section > 0){
            int lastNum = section % 10;//ȡ��ǰ��λ�����λ��ֵ
            if(lastNum == 0){
                if(!zero){
                    //��Ҫ����Ĳ�����ȷ�������������ֻ�����һ��
                    zero = true;
                    chineseNum = chnMinorNum[0] + chineseNum;
                }
            }else{
                zero = false;
                setionChinese = chnMinorNum[lastNum];//����λ
                setionChinese = setionChinese + chnMinorPosition[position];//��λ
                chineseNum = setionChinese + chineseNum;
            }
            position++;
            section = section/10;
        }
        return chineseNum;
    }

    public static void main(String[] args) {
        System.out.println(convetToChinese(12301201));

    }

}
