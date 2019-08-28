package com.g;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/*
字节流
字符流
 */
public class Wenjian {
    public static void main(String[] args) throws IOException {
        //WriteFile();
        //ReadFile();
        //write_utf_8();
        read_gbk();
    }

    private static void read_gbk() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("文件流\\gbk.txt"), "gbk");
        osw.write("一个gbk格式的文本文件");
        osw.flush();
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("文件流\\gbk.txt"),"gbk");
        int read = 0;
        while ((read=isr.read())!=-1){
            System.out.print((char)read);
        }
        isr.close();
    }

    private static void write_utf_8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("文件流\\1.txt"), StandardCharsets.UTF_8);
        osw.write("中文文字");
        osw.flush();
        osw.close();
    }


    public static void WriteFile() throws IOException {
        String dir = "newFolder";
        File f = new File(dir);
        boolean b1 = f.mkdirs();
        System.out.println(b1);

        f = new File(dir + "\\a.txt");
        boolean b2 = f.createNewFile();
        System.out.println(b2);

        FileOutputStream fos = new FileOutputStream(f);
        String s = "aab字符";
        byte[] bs = s.getBytes();
        System.out.println(Arrays.toString(bs));
        fos.write(bs);
        fos.close();
    }

    public static void ReadFile() throws IOException {
        File f = new File("newFolder\\a.txt");
        FileInputStream fis = new FileInputStream(f);
        //read()方法返回下个字节数,末尾返回-1
        int read = 0;
        while ((read = fis.read()) != -1) {
            System.out.print(read + " ");
        }
        fis.close();

        fis = new FileInputStream(f);
        //read(byte[] bytes)方法返回读到的字节个数
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        fis.close();
    }


}