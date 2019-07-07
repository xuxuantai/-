package 剑指offer;

public class 序列化二叉树 {


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
            //每次进入就将str往后推一位
            index++;
            //将传入字符串分割为字符串数组
            String[] strings = str.split(",");
            TreeNode node = null;
            //当节点不为null时，构建节点
            if(!strings[index].equals("#")){
                node = new TreeNode(Integer.valueOf(strings[index]));
                node.left = Deserialize(str);
                node.right = Deserialize(str);

            }
            return node;
        }
    }
}
