package cn.itcast.demo06.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo02PropertiesLoad {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("day26-io-property//properties.txt"));
        Set<String> keySet = prop.stringPropertyNames();

        for (String key : keySet) {
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }
}
