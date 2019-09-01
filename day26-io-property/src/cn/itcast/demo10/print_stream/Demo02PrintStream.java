package cn.itcast.demo10.print_stream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Print in the system");
        PrintStream ps  = new PrintStream("day26-io-property//print2.txt");
        System.setOut(ps);
        System.out.println("Print in the target file of Printstream.");
    }
}
