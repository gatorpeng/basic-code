package cn.itcast.demo03_VariableArguments;

public class Demo02VarArgs {
    public static void main(String[] args) {
        stringPrint(20,2.34,"ESPN","MITBBS","SINA","YAHOO");
    }

    private static void stringPrint(int num01,double num02,String...arr) {
        System.out.print(num01+" ");
        System.out.print(num02+" ");
        for (String s : arr) {
            System.out.print(s +" ");
        }
        System.out.println("The print is finished.");
    }
}