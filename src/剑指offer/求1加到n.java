package ��ָoffer;

/**
 * Created by LaoP on 2019/7/24.
 */
public class ��1�ӵ�n {
    /**
     * ����ʹ��if���
     * ���� && �Ķ�·���ԡ���һ���������������Ͳ�ִ�еڶ���������
     * @param n
     * @return
     */
    public int Sum_Solution(int n) {
        int sum = n;
        boolean b = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;

    }
}
