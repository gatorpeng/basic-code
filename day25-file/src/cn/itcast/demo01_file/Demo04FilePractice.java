package cn.itcast.demo01_file;

import java.io.File;
import java.io.IOException;

/*
* createNewFile(): is intended to only create a file, rather than folder.
* delete();   delete files
* mkdir(): build a new folder
* mkdirs():
* */

public class Demo04FilePractice {

    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\xinla\\Java\\IdeaProject\\basic-code01\\day25-file\\1.txt");
        boolean b1 = f1.createNewFile();
        System.out.println(b1);

        File f2 = new File("C:\\Users\\xinla\\Java\\IdeaProject\\basic-code01\\day25-file");
        boolean b2 = f2.createNewFile();
        System.out.println(b2);

        File f3 = new File("day25-file\\new folder");
        boolean b3 = f3.mkdir();
        System.out.println(b3);

        boolean b4 = f3.delete();
        System.out.println(b4);

        f1.delete();
    }
}
