package offer66;

public class No5Ìæ»»¿Õ¸ñ {
    public String replaceSpace(StringBuffer str) {
//        String Str = str.toString();
//        String newStr = Str.replaceAll(" ", "%20");
//        return newStr;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if(str.charAt(i) == ' '){
                str.append("  ");
            }
        }
        int newLen = str.length();
        int a = len - 1;
        int b = newLen - 1;
        while (a >= 0 && newLen >= 0) {
            if(str.charAt(a) == ' '){
                str.setCharAt(b--, '0');
                str.setCharAt(b--, '2');
                str.setCharAt(b--, '%');
                a--;
            }else{
                str.setCharAt(b--, str.charAt(a--));
            }
        }
        return str.toString();

    }
}
