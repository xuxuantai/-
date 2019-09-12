package LeetCode;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class No1115½»Ìæ´òÓ¡Foobar {
    class FooBar {
        private int n;
        private Semaphore semaphore;
        private CyclicBarrier cyclicBarrier;

        public FooBar(int n) {
            this.n = n;
            this.semaphore = new Semaphore(0);
            this.cyclicBarrier = new CyclicBarrier(2);
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            try{
                for (int i = 0; i < n; i++) {
                    // printFoo.run() outputs "foo". Do not change or remove this line.
                    printFoo.run();
                    semaphore.release();
                    cyclicBarrier.await();
                }
            }catch (Exception e){

            }

        }

        public void bar(Runnable printBar) throws InterruptedException {

            try{
                for (int i = 0; i < n; i++) {
                    semaphore.acquire();
                    // printBar.run() outputs "bar". Do not change or remove this line.
                    printBar.run();
                    cyclicBarrier.await();
                }
            }catch (Exception e){

            }

        }
    }
}
