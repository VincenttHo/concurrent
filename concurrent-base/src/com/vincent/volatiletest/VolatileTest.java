package com.vincent.volatiletest;

public class VolatileTest {

    User user = new User();

    class SetStopThread extends Thread {

        User user;

        public SetStopThread(User user) {
            this.user = user;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.user.addAge();
            System.out.println("…Ë1¡À");
        }
    }

    class WhileTrueThread extends Thread {

        User user;

        public WhileTrueThread(User user) {
            this.user = user;
            Boolean flag = false;
            flag.booleanValue();
        }

        @Override
        public void run() {
            int n = 0;
            while (this.user.getAge() == 0) {
                System.out.println("—≠ª∑" + (++n));
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        VolatileTest test = new VolatileTest();
        SetStopThread thread1 = test.new SetStopThread(test.user);
        WhileTrueThread thread2 = test.new WhileTrueThread(test.user);
        thread1.start();
        thread2.start();
    }

}
