package ��ָoffer;

import java.util.Arrays;

public class �˿���˳�� {

    /**
     * �ȶ���������Ȼ��������ӵĸ�����ѭ���ж���ӹ�������
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
            //��������ȣ�����˳��
            if(numbers[i] == numbers[i + 1]){
                return false;
            }
            //��֮���м�����������ӵ�����
            cnt -= numbers[i + 1] - numbers[i] - 1;
        }
        return cnt >= 0;
    }
}
