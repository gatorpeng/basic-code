package cn.itcast.demo06.properties;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
//        show01();
        show02();
    }

    private static void show02() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("Scarlett Johansson","32");
        prop.setProperty("Julia Roberts","40");
        prop.setProperty("Katy Perry","32");

        //prop.store(new FileWriter("day26-io-property//a.txt"),"Save Data");

        FileOutputStream fos = new FileOutputStream("day26-io-property//properties.txt");
        prop.store(fos,"Data");
        fos.close();
    }

    private static void show01() {
        Properties prop = new Properties();
        prop.setProperty("Scarlett Johansson","32");
        prop.setProperty("Julia Roberts","40");
        prop.setProperty("Katy Perry","32");

        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key +"="+value );
        }
    }
}
