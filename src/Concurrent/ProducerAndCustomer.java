package Concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 * ʹ����������ArrayBlockingQueueʵ������������������
 */
public class ProducerAndCustomer {
    private final BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(10);
    class Producer implements Runnable{
        @Override
        public void run(){
            for (int i = 0; i < 10; i++) {
                try{
                    Thread.sleep(3000);
                    bq.put(1);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

        }
    }

    class Customer implements Runnable{
        @Override
        public void run(){
            try{
                Thread.sleep(3000);
                bq.take();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
