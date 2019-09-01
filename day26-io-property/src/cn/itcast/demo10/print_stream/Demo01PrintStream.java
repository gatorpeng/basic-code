package cn.itcast.demo10.print_stream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("day26-io-property//print.txt");
        ps.write(97);
        ps.write("\r\n".getBytes());
        ps.println(97);
        ps.println(8.8);
        ps.println(true);
        ps.println("aadcadf");
        ps.close();
    }
}
