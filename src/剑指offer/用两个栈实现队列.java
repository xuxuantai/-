package ��ָoffer;
import java.util.*;
/**
 * Created by LaoP on 2019/4/15.
 */
public class ������ջʵ�ֶ��� {
    /**
     * ������ջ��ʵ��һ�����У���ɶ��е�Push��pop����
     */
    /**
     * in ջ����������ջ��push��������out ջ���������ջ��pop��������
     * һ��Ԫ�ؽ��� in ջ֮�󣬳�ջ��˳�򱻷�ת��
     * ��Ԫ��Ҫ��ջʱ����Ҫ�Ƚ��� out ջ����ʱԪ�س�ջ˳����һ�α���ת.
     * ��˳�ջ˳��ͺ��ʼ��ջ˳������ͬ�ģ��Ƚ����Ԫ�����˳�������Ƕ��С�
     */
    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();

    public void push(int node) {
        in.push(node);
    }

    public int pop() throws Exception {
        if (out.isEmpty())
            while (!in.isEmpty())
                out.push(in.pop());

        if (out.isEmpty())
            throw new Exception("queue is empty");

        return out.pop();
    }

}
