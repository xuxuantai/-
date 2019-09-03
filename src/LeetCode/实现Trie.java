package LeetCode;

public class ʵ��Trie {
    class Trie {
        private Trie root;
        private int R = 26;
        private Trie[] tries;
        private boolean isEnd;

        /** Initialize your data structure here. */
        public Trie() {
            tries = new Trie[R];
        }

        public Trie get(char ch){
            return tries[ch - 'a'];
        }
        public void put(char ch){
            tries[ch - 'a'] = new Trie();
        }
        private boolean contains(char ch){
            return tries[ch - 'a'] != null;
        }


        /**
         * ����һ���ַ���
         * @param word
         */
        public void insert(String word) {
            Trie node = root;
            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                if(!node.contains(currentChar)){
                    node.put(currentChar);
                }
                node.get(currentChar);
            }
            //���ַ�����β��ĸ��Ϊ������ĸ
            node.isEnd = true;
        }

        /**
         * ����ǰ׺�Ƿ����
         * @param word
         * @return �������һ����ĸ�Ľڵ�
         */
        private Trie searchPrefix(String word) {
            Trie node = root;
            for (int i = 0; i < word.length(); i++) {
                char cunrrentChar = word.charAt(i);
                if(node.contains(cunrrentChar)){
                    node = node.get(cunrrentChar);
                }else{
                    return null;
                }
            }
            return node;
        }

        /**
         * �����ַ����Ƿ����
         * @param word
         * @return
         */
        public boolean search(String word){
            //ǰ׺�����ڣ������һ����ĸΪ��β��ĸ
            Trie node = searchPrefix(word);
            return node != null && node.isEnd;
        }


        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            return searchPrefix(prefix) != null;
        }
    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
}
