package netease;

import java.util.Scanner;

/**
 * Created by LaoP on 2019/8/1.
 */
public class �˯ {
    /**
     * С�׾��ø�����̫�����ˣ�����˯�����������Կ��ϵ�һЩ����ͦ����Ȥ������ϣ��������ʦ������Ȥ�Ĳ��ֵ�ʱ�������һ�¡���֪����С�׶�һ�ÿ�ÿ����֪ʶ��ĸ���Ȥ�̶ȣ����Է����������Լ��������ÿ���ÿ�����Ƿ��˯�ţ�����Խ�����һ�Σ����ʹ�����ڽ�������k�����ڱ������ѡ�����Ҫѡ��һ�ַ������С�����ÿ�������֪ʶ���ֵ��
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int wide = scanner.nextInt();
        int[] weights = new int[len];
        int[] isAlive = new int[len];
        for (int i = 0; i < len; i++) {
            weights[i] = scanner.nextInt();
        }
        for (int i = 0; i < len; i++) {
            isAlive[i] = scanner.nextInt();
        }

        int maxWeight = 0;
        for (int i = 0; i < len; i++) {
            if(isAlive[i] == 1){
                maxWeight += weights[i];
            }
        }

        int result = 0;
        for (int start = 0; start < len; start++) {
            int max = maxWeight;
            for (int i = start; i < start + wide; i++) {
                if(i >= len){
                    break;
                }
                if(isAlive[i] == 0){
                    max += weights[i];
                }
            }
            result = Math.max(result, max);
        }
        System.out.println(result);
    }
}
