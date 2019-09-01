package cn.itcast.demo07.buffer;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo05Practice {
    public static void main(String[] args) throws IOException {

        // create a harshmap
        HashMap<String, String> map = new HashMap<>();
        // create a buffered reader
        BufferedReader br = new BufferedReader(new FileReader("day26-io-property//In.txt"));
        // create a buffered writer
        BufferedWriter bw = new BufferedWriter(new FileWriter("day26-io-property//Out.txt"));

        //use readline() to load the strings
        String line;
        while((line = br.readLine())!=null) {
            String[] split = line.split("\\_");
            map.put(split[0],split[1]);
        }

        Set<String> set = map.keySet();
        for (String key : set) {
            String value = map.get(key);
            bw.write(key+"_"+value);
            bw.newLine();
        }

        br.close();
        bw.close();

    }
}
