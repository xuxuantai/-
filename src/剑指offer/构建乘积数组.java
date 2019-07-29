package 剑指offer;

/**
 * Created by LaoP on 2019/7/24.
 */
public class 构建乘积数组 {
    /**
     * 上三角下三角
     * 第一遍循环后，result存的该点前边点所有的乘积
     * 第二遍循环，将result乘以该点后所有点的乘积。
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
