package netease;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by LaoP on 2019/8/1.
 */
public class ����˹���� {
    /**
     * С����һ�����ϵ���Ϸ�����������ž������Ϸ����˹���顣��Ϊ���ȽϹ��ϣ����Թ����һ��Ķ���˹���鲻ͬ��
     ӫĻ��һ���� n �У�ÿ�ζ�����һ�� 1 x 1 �ķ���������£���ͬһ���У������µķ���������ǰ�ķ���֮�ϣ���һ���з��鶼��ռ��ʱ����һ�лᱻ��ȥ�����õ�1�֡�
     ��һ�죬С���ֿ���һ����Ϸ�����浽�� m ����������ʱ������̫���ľ͹ص��ˣ�С��ϣ��������������Ϸ����õķ�����
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wide = scanner.nextInt();
        int len = scanner.nextInt();
        int[] temp = new int[wide + 1];
        Arrays.fill(temp, 0);

//        String a = scanner.nextLine();
//        String[] cube = a.split(" ");
        for (int i = 0; i < len; i++) {
            temp[scanner.nextInt()]++;
        }
        int result = Integer.MAX_VALUE;
        for (int i = 1; i <= wide; i++) {
            if(temp[i] == 0){
                result = 0;
            }else{
                result = Math.min(result, temp[i]);
            }
        }
        System.out.println(result);
    }
}
