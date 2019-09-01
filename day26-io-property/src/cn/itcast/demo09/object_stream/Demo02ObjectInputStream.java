package cn.itcast.demo09.object_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day26-io-property//object.txt"));
        Object object = ois.readObject();
        ois.close();

        Person p = (Person) object;
        System.out.println(p);
    }
}
