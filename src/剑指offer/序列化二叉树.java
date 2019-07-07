package ��ָoffer;

public class ���л������� {


    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public class Solution {
        String Serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            if(root == null){
                sb.append("#,");
                return sb.toString();
            }
            sb.append(root.val + ",");
            sb.append(Serialize(root.left));
            sb.append(Serialize(root.right));
            return sb.toString();
        }


        private int index = -1;
        TreeNode Deserialize(String str) {
            //ÿ�ν���ͽ�str������һλ
            index++;
            //�������ַ����ָ�Ϊ�ַ�������
            String[] strings = str.split(",");
            TreeNode node = null;
            //���ڵ㲻Ϊnullʱ�������ڵ�
            if(!strings[index].equals("#")){
                node = new TreeNode(Integer.valueOf(strings[index]));
                node.left = Deserialize(str);
                node.right = Deserialize(str);

            }
            return node;
        }
    }
}
