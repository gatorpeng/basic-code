package cn.itcast.demo09.object_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day26-io-property//object.txt"));
        oos.writeObject(new Person(20, "Scarlett Johansson"));
        oos.close();
    }
}
