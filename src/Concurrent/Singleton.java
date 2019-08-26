package Concurrent;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

//˫�ؼ�����̰߳�ȫ�ĵ���ģʽ
public class Singleton {
    private volatile Singleton uniqueInstance;

    public Singleton(){

    }


    public Singleton getUniqueInstance() {
        //���ж϶����Ƿ��Ѿ�ʵ������δ��ʵ���������ܽ�������������ʵ������
        if(uniqueInstance == null){
            //����������
            synchronized (Singleton.class){
                //�����������֮ǰ�ٽ����ж�
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
