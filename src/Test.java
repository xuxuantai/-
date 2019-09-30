import javax.xml.soap.Node;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.Queue;

import static java.util.Objects.hash;

public class Test{

    public static void main(String[] args) throws Exception {
        /**
         * java反射
         */
        /**
         * 获取Class对象的三种方法
         */
        String s = new String();
        Class clazz1 = s.getClass();
        Class clazz2 = Class.forName("java.lang.String");
        Class clazz3 = String.class;

        //测试反射方法
        Method[] methods = clazz1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.toString());
        }

        /**
         * 要求创建的对象必须有空构造类
         */
        String s1 = (String) clazz1.newInstance();


        /**
         * JDK动态代理
         */
//        Proxy.newProxyInstance();
        Queue queue = new ArrayDeque();

        /**
         * 一致性hash的实现
         */
        String key = "abc";
        long hash = hash(key);
//        long index = hash % node.size()


    }
}
