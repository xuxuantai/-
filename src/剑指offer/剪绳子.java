package 剑指offer;

/**
 * Created by XXT on 2019/6/29.
 */


/**
 * 把一根绳子剪成多段，并且使得每段的长度乘积最大。
 */

/**
 * 贪心算法
 */
public class 剪绳子 {
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
        //除了3剩下都以2相乘
        int timesof2 = (n - timesof3 * 3)/2;
        return (int)(Math.pow(3,timesof3) * Math.pow(2,timesof2));
    }
}
