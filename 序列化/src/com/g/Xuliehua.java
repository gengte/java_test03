package com.g;

import java.io.*;
import java.util.ArrayList;

public class Xuliehua {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //xuliehua();
        //fanxuliehua();
        xuliehua2();
    }

    private static void fanxuliehua() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("序列化\\person"));
        Person obj = (Person) ois.readObject();
        System.out.println(obj.getName() + " " + obj.getAge());
        obj = (Person) ois.readObject();
        System.out.println(obj.toString());
    }

    private static void xuliehua() throws IOException {
        //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("序列化\\person.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("序列化\\person"));
        oos.writeObject(new Person("李白", 20));
        oos.writeObject(new Person("杜甫", 30));
        oos.flush();
        oos.close();
    }

    private static void xuliehua2() throws IOException, ClassNotFoundException {
        ArrayList<Person> arr = new ArrayList<Person>();
        arr.add(new Person("司马懿", 35));
        arr.add(new Person("曹丕", 15));
        arr.add(new Person("甄宓", 10));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("序列化\\person2"));
        oos.writeObject(arr);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("序列化\\person2"));
        for (Person p : (ArrayList<Person>) ois.readObject()) {
            System.out.println(p.toString());
        }
        ois.close();
    }
}
