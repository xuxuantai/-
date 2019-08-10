package netease;

import java.util.Scanner;

/**
 * Created by LaoP on 2019/8/1.
 */
public class 丰收 {
    /**
     * 又到了丰收的季节，恰逢小易去牛牛的果园里游玩。
     牛牛常说他对整个果园的每个地方都了如指掌，小易不太相信，所以他想考考牛牛。
     在果园里有N堆苹果，每堆苹果的数量为ai，小易希望知道从左往右数第x个苹果是属于哪一堆的。
     牛牛觉得这个问题太简单，所以希望你来替他回答。
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
                    //位于当前堆
                    result = j + 1;
                    break;
                }else if(count > num){
                    //超过当前堆,则减去当前堆的数目
                    count -= num;
                }
            }
            System.out.println(result);

        }



    }
}
