package netease;

import java.util.Scanner;

/**
 * Created by LaoP on 2019/8/1.
 */
public class ���� {
    /**
     * �ֵ��˷��յļ��ڣ�ǡ��С��ȥţţ�Ĺ�԰�����档
     ţţ��˵����������԰��ÿ���ط�������ָ�ƣ�С�ײ�̫���ţ��������뿼��ţţ��
     �ڹ�԰����N��ƻ����ÿ��ƻ��������Ϊai��С��ϣ��֪��������������x��ƻ����������һ�ѵġ�
     ţţ�����������̫�򵥣�����ϣ�����������ش�
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numsLen = scanner.nextInt();
        int[] nums = new int[numsLen];
        for (int i = 0; i < numsLen; i++) {
            nums[i] = scanner.nextInt();
        }

        int countsLen = scanner.nextInt();
        int[] counts = new int[countsLen];
        for (int i = 0; i < countsLen; i++) {
            counts[i] = scanner.nextInt();
        }

        int result = 0;
        for (int i = 0; i < countsLen; i++) {
            int count = counts[i];
            for (int j = 0; j < numsLen; j++) {
                int num = nums[j];
                if(count <= num){
                    //λ�ڵ�ǰ��
                    result = j + 1;
                    break;
                }else if(count > num){
                    //������ǰ��,���ȥ��ǰ�ѵ���Ŀ
                    count -= num;
                }
            }
            System.out.println(result);

        }



    }
}
