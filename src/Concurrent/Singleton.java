package Concurrent;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

//双重检验的线程安全的单例模式
public class Singleton {
    private volatile Singleton uniqueInstance;

    public Singleton(){

    }


    public Singleton getUniqueInstance() {
        //先判断对象是否已经实例过，未被实例化过才能进入加锁代码进行实例化；
        if(uniqueInstance == null){
            //对类对象加锁
            synchronized (Singleton.class){
                //进入加锁代码之前再进行判断
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
