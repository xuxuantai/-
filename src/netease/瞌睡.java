package netease;

import java.util.Scanner;

/**
 * Created by LaoP on 2019/8/1.
 */
public class 瞌睡 {
    /**
     * 小易觉得高数课太无聊了，决定睡觉。不过他对课上的一些内容挺感兴趣，所以希望你在老师讲到有趣的部分的时候叫醒他一下。你知道了小易对一堂课每分钟知识点的感兴趣程度，并以分数量化，以及他在这堂课上每分钟是否会睡着，你可以叫醒他一次，这会使得他在接下来的k分钟内保持清醒。你需要选择一种方案最大化小易这堂课听到的知识点分值。
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
