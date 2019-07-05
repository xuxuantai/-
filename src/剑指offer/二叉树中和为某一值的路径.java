package ��ָoffer;

import java.util.ArrayList;

/**
 * Created by LaoP on 2019/7/5.
 */
public class �������к�Ϊĳһֵ��·�� {

     public class TreeNode {
         int val = 0;
         TreeNode left = null;
         TreeNode right = null;

         public TreeNode(int val) {
            this.val = val;
         }
     }

    /**
     * ˼�룺����������ȱ���
     */
    /**
     * ���������±���ʱ����targetΪ0���ҽڵ���������������Ϊ��ʱ������
     */
    public class Solution {
        //����ȫ�ֱ���lists�洢����·����list�洢��ǰ�ݹ�����е�·����
        private ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        private ArrayList<Integer> list = new ArrayList<>();

        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
            //��������null�Ľڵ�ʱ����������·��
            if(root == null){
                return lists;
            }
            //��ӵ�ǰ�ڵ�ֵ��list��������target
            list.add(root.val);
            target -= root.val;
            //�ҵ�һ������������·��list������lists
            if(target == 0 && root.left == null && root.right == null){
                //ע�⣡����list����newһ���µ�Array������ֱ�Ӵ��룬��Ϊ���ܻ�ı䵱ǰ�ݹ���list��ֵ
                lists.add(new ArrayList<>(list));
            }
            //�Ըýڵ�������������ݹ�ִ��
            FindPath(root.left, target);
            FindPath(root.right, target);
            //�����ƶ�һ�㣬�Ƴ����һ�ε�·��list
            list.remove(list.size() - 1);
            return lists;
        }
    }
}
