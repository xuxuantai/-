import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception{
        /**
         * java����
         */
        /**
         * ��ȡClass��������ַ���
         */
        String s = new String();
        Class clazz1 = s.getClass();
        Class clazz2 = Class.forName("java.lang.String");
        Class clazz3 = String.class;

        //���Է��䷽��
        Method[] methods = clazz1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.toString());
        }

        /**
         * Ҫ�󴴽��Ķ�������пչ�����
         */
        String s1 = (String) clazz1.newInstance();

    }
}
