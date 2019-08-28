package com.g;

public class XiaoFeiZhe implements Runnable {
    private Baozi bz;

    public XiaoFeiZhe(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (!bz.isOkay) {
                    try {
                        bz.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃。。。");
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("吃完啦。");
                bz.isOkay = false;
                bz.notify();
            }
        }
    }
}