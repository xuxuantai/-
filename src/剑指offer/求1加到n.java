package 剑指offer;

/**
 * Created by LaoP on 2019/7/24.
 */
public class 求1加到n {
    /**
     * 不能使用if语句
     * 利用 && 的短路特性。第一个条件不成立，就不执行第二个条件了
     * @param n
     * @return
     */
    public int Sum_Solution(int n) {
        int sum = n;
        boolean b = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;

    }
}
