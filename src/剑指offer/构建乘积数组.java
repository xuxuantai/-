package ��ָoffer;

/**
 * Created by LaoP on 2019/7/24.
 */
public class �����˻����� {
    /**
     * ������������
     * ��һ��ѭ����result��ĸõ�ǰ�ߵ����еĳ˻�
     * �ڶ���ѭ������result���Ըõ�����е�ĳ˻���
     * @param A
     * @return
     */
    public int[] multiply(int[] A) {
        int length = A.length;
        int[] result = new int[length];
        int product = 1;
        for (int i = 0; i < length; i++) {
            result[i] = product;
            product *= A[i];
        }
        product = 1;
        for (int i = length - 1; i >= 0; i--) {
            result[i] *= product;
            product *= A[i];
        }
        return result;

    }
}
