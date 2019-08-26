package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int low = scanner.nextInt();
            int high = scanner.nextInt();
            List<Integer> nums = new ArrayList<Integer>();

            for (int i = low; i < high; i++) {
                boolean isZhishu = true;
                for (int j = 2; j < i - 1; j++) {
                    if(i % j == 0){
                        isZhishu = false;
                        break;
                    }
                }
                if(isZhishu){
                    nums.add(i);
                }
            }

            int sumA = 0;
            int sumB = 0;
            for (int i = 0; i < nums.size(); i++) {
                //计算十位
                int a = 0;
                if(nums.get(i) > 10){
                    a = (nums.get(i) % 100) / 10;
                }
                //计算个位
                int b = nums.get(i) % 10;
                //累加
                sumA += a;
                sumB += b;
            }
            int result = sumA < sumB ? sumA : sumB;
            System.out.println(result);
        }
    }
}
