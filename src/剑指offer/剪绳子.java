package ��ָoffer;

/**
 * Created by XXT on 2019/6/29.
 */


/**
 * ��һ�����Ӽ��ɶ�Σ�����ʹ��ÿ�εĳ��ȳ˻����
 */

/**
 * ̰���㷨
 */
public class ������ {
    public int integerBreak(int n){
        if(n < 2){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        if(n == 3){
            return 2;
        }
        int timesof3 = n/3;
        System.out.print(timesof3);
        if(n - timesof3 * 3 == 1){
            timesof3 = timesof3 - 1;
        }
        //����3ʣ�¶���2���
        int timesof2 = (n - timesof3 * 3)/2;
        return (int)(Math.pow(3,timesof3) * Math.pow(2,timesof2));
    }
}
