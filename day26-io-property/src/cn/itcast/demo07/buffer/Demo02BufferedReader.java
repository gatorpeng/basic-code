package cn.itcast.demo07.buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo02BufferedReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("day26-io-property//b.txt"));
        // use the char array to store the content;
        /*int len = 0;
        char[] chars = new char[1024];
        while((len = br.read(chars))!=-1) {
            System.out.println(new String(chars,0,len));
        }*/

        // use the readline() to read
        String line;
        while ((line = br.readLine())!=null) {
            System.out.println(line);
        }
        br.close();
    }
}
