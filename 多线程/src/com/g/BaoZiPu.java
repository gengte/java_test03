package com.g;

public class BaoZiPu extends Thread {
    private Baozi bz;

    public BaoZiPu(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.isOkay) {
                    try {
                        bz.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("正在做包子。。。");
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("做好了。");
                bz.isOkay = true;
                bz.notify();
            }
        }
    }
}