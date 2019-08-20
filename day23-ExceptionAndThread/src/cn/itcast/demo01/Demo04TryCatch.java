package cn.itcast.demo01;

import java.io.IOException;

/*Format:
* Try {
*
* } Catch(){
*
* };
* */
public class Demo04TryCatch {

    public static void main(String[] args) {

        try {
            readFile("C://fina.exe");
        } catch (IOException e) {
//            System.out.println("the suffix is incorrect");
//            throw new ArrayIndexOutOfBoundsException();
            /*
            * three methods in the throwable to handle the exceptions
            * */

            //method 1: getMessage();
//            System.out.println(e.getMessage());

            //method 2: toString();
            System.out.println(e.toString());

            //method 3:void printStackTrace();
//            e.printStackTrace();

        }

        System.out.println("The rest of the code is executed");
    }

    public static void readFile(String filePath) throws IOException {
        /*if (!filePath.equals("C://final.txt")){
            throw new FileNotFoundException("the directory is incorrect!");
        }*/

        if (!filePath.endsWith(".txt")) {
            throw new IOException("The suffix is incorrect.");
        }

        System.out.println("The file is correct and has been executed");
    }

}
