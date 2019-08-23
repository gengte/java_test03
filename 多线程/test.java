public class test {
    public static void main(String[] args) {
        Baozi bz = new Baozi();
        BaoZiPu bzp = new BaoZiPu(bz);
        bzp.start();
        XiaoFeiZhe xfz = new XiaoFeiZhe(bz);
        new Thread(xfz).start();
    }

}
