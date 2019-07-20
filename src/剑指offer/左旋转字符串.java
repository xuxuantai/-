package 剑指offer;

public class 左旋转字符串 {

    /**
     * 先旋转前n个字符与其余字符，在进行整体旋转。
     * @param str
     * @param n
     * @return
     */
    public String LeftRotateString(String str,int n) {
        if(n >= str.length()){
            return str;
        }
        char[] chars = str.toCharArray();
        reverse(chars, 0, n - 1);
        reverse(chars, n, chars.length - 1);
        reverse(chars,0, chars.length - 1);
        return new String(chars);

    }

    private void reverse(char[] chars, int i, int j){
        while (i < j){
            swap(chars, i++, j--);
        }
    }

    private void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
