package LeetCode;

public class 实现Trie {
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
         * 插入一个字符串
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
            //将字符串结尾字母置为结束字母
            node.isEnd = true;
        }

        /**
         * 查找前缀是否存在
         * @param word
         * @return 返回最后一个字母的节点
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
         * 查找字符串是否存在
         * @param word
         * @return
         */
        public boolean search(String word){
            //前缀都存在，且最后一个字母为结尾字母
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
