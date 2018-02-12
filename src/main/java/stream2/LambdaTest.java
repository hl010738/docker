package stream2;

import java.util.ArrayList;

public class LambdaTest {

    Runnable r1 = () -> System.out.println(this);

    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println(this);
        }
    };

    Runnable r3 = new RunnableTest();

    class RunnableTest implements Runnable{
        @Override
        public void run() {
            System.out.println(this);
        }
    }

    public static void main(String[] args) {

        LambdaTest test = new LambdaTest();

        Thread t1 = new Thread(test.r1);
        t1.start();

        System.out.println("----" + test.r1.getClass().getName());

        Thread t2 = new Thread(test.r2);
        t2.start();

        System.out.println("--++++++--" + test.r2.getClass().getName());

        Thread t3 = new Thread(test.r3);
        t3.start();

        System.out.println("--11111--" + test.r3.getClass().getName());

    }
}
