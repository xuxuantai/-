package 剑指offer;

import java.util.Arrays;

public class 扑克牌顺子 {

    /**
     * 先对数组排序，然后计算出癞子的个数，循环判断癞子够不够用
     */
    public boolean isContinuous(int [] numbers) {
        if(numbers.length < 5){
            return false;
        }
        Arrays.sort(numbers);
        int cnt = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 0){
                cnt++;
            }
        }
        for(int i = cnt; i < numbers.length - 1; i++){
            //当有数相等，则不能顺子
            if(numbers[i] == numbers[i + 1]){
                return false;
            }
            //数之间有间隔，则减少癞子的数量
            cnt -= numbers[i + 1] - numbers[i] - 1;
        }
        return cnt >= 0;
    }
}
