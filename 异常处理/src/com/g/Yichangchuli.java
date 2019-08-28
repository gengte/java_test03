package com.g;

import java.io.IOException;
import java.util.*;

public class Yichangchuli {
    static String[] usernames = { "abc", "abd", "123" };

    public static void main(String[] args) {
        // try {
        // Yichang(11);
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // System.out.println(e.toString());
        // e.printStackTrace();
        // System.out.println("catch exceptino...");
        // }
        // System.out.println("bbb");

        Scanner s = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = s.next();
        s.close();
        try {
            checkUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Yichang(int i) throws Exception {
        if (i != 1) {
            throw new IOException("io错误.");
        }
        System.out.println("aaa");
    }

    public static void checkUsername(String username) throws RegisterException {
        for (String name : usernames) {
            if (name.equals(username)) {
                throw new RegisterException("用户名已存在！");
            }
        }
        System.out.println("注册成功!");
    }
}