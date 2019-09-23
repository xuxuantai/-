package Alibaba;

/**
 * Created by XXT on 2019/9/20.
 */

/**
 * 在阿里内部的智能应用里面有一种智能应用叫TTS。就是将文本转成语音输出，在我们的天猫精灵和阿里客服的智能IVR中应用广泛。
 * 在做朗读的时候经常会碰到文本中有阿拉伯的数字需要转成中文的方式进行朗读。
 *
 * 比如说 1000，就需要朗读成 一千
 * 比如说 10002，就需要朗读成 一万零二
 * 比如说 3001111，需要朗读成 三百万一千一百一十一
 *
 * 当数字比较大的时候，我们希望能够朗读的更人性化一些，会在中间稍微停顿一下。
 * 比如说刚才的300 1111，我们希望朗读成 三百万，一千一百一十一
 * 比如说1682 1234 5678，我们希望朗读成 一千六百八十二亿，一千二百三十四万，五千六百七十八
 * 通过 中文逗号 来表达一个停顿，根据朗读习惯，一次性朗读的中文数字最好不要大于8个字，否则就建议增加一个停顿。
 * 所以 10002，就不需要停顿，直接读：一万零二
 * 但是 11234，就需要停顿一下，变成：一万，一千二百三十四
 *
 * 希望同学们能实现这样一个转换的方法，将阿拉伯数字转换成中文，同时还能考虑到朗读的停顿体验。
 *
 * ps：阿拉伯数字对应的中文参考表为：
 * 零一二三四五六七八九十
 * 千百万亿
 *
 * ps：假定我们的数字不超过一万亿
 */
public class ConvetToChinese {
    public static String[] chnPosition = {"", "万，","亿，"};
    public static String[] chnMinorPosition = {"","十","百","千"};
    public static String[] chnMinorNum = {"零","一","二","三","四","五","六","七","八","九"};


    public static String convetToChinese(int num){

        String result = new String();
        String chinese = new String();//中文数字字符串
        String str = new String();

        int position = 0;//进位标识
        boolean zero = false;//是否需要补零
        while(num > 0){
            int section = num % 10000;//标记位，比如万，亿
            if(zero){
                //判断是否需要补零
                result = "零" + result;
            }

            //对当前万进位进行转换，4位数
            chinese = convetToChinese(section,chinese);

            if(section > 0){
                //如果是进位，需要补上进位符号
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
     * 输入所在进位
     * @param section
     * @param chineseNum
     * @return
     */
    public static String convetToChinese(int section, String chineseNum){
        String setionChinese = new String();
        int position = 0;
        boolean zero = true;//4位内判断是否补零
        while(section > 0){
            int lastNum = section % 10;//取当前进位中最后位的值
            if(lastNum == 0){
                if(!zero){
                    //需要补零的操作，确保对连续多个零只是输出一个
                    zero = true;
                    chineseNum = chnMinorNum[0] + chineseNum;
                }
            }else{
                zero = false;
                setionChinese = chnMinorNum[lastNum];//数字位
                setionChinese = setionChinese + chnMinorPosition[position];//进位
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
