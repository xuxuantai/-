import javax.xml.soap.Node;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.Queue;

import static java.util.Objects.hash;

public class Test{

    public static void main(String[] args) throws Exception {
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


        /**
         * JDK��̬����
         */
//        Proxy.newProxyInstance();
        Queue queue = new ArrayDeque();

        /**
         * һ����hash��ʵ��
         */
        String key = "abc";
        long hash = hash(key);
//        long index = hash % node.size()


    }
}
