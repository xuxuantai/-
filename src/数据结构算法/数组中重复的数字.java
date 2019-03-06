package ���ݽṹ�㷨;

/**
 * Created by LaoP on 2019/3/5.
 */
public class �������ظ������� {
    /**
     * ��Ŀ����
     ��һ������Ϊ n ����������������ֶ��� 0 �� n-1 �ķ�Χ�ڡ�
     ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ģ�Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡�
     *����˼·
     Ҫ����ʱ�临�Ӷ� O(N)���ռ临�Ӷ� O(1)����˲���ʹ������ķ�����Ҳ����ʹ�ö���ı�����顣
     ������������Ԫ���� [0, n-1] ��Χ�ڵ����⣬���Խ�ֵΪ i ��Ԫ�ص������� i ��λ���Ͻ�����⡣
     �� (2, 3, 1, 0, 2, 5) Ϊ����������λ�� 4 ʱ����λ���ϵ���Ϊ 2�����ǵ� 2 ��λ�����Ѿ���һ�� 2 ��ֵ�ˣ���˿���֪�� 2 �ظ�
     */
    /**
     *
     * @param nums
     * @param length
     * @param duplication �����ظ�������
     * @return
     */
     public boolean duplicate(int[] nums, int length, int[] duplication){
         if(nums == null || length <= 0){
             return false;
         }
         for(int i = 0; i < length; i++){
             while(nums[i] != i){
                 if(nums[i] == nums[nums[i]]){
                     duplication[0] = nums[i];
                     return true;
                 }
                 swap(nums,i,nums[i]);
             }
         }
         return false;
     }
     private void swap(int[] nums,int i,int j){
         int a = nums[i];
         nums[i] = nums[j];
         nums[j] = a;
     }

}
