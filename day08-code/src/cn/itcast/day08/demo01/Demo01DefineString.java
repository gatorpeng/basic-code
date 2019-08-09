package cn.itcast.day08.demo01;

public class Demo01DefineString {

    public static void main(String[] args) {
//the empty string;
        String st1 = new String();
        System.out.println("st1=" + st1);

//the char array;
        char[] charArray = {'A','B','C'};
        String st2 = new String(charArray);

        System.out.println("st2= "+st2);

// the byte array;
        byte[] byteArray = {65,66,67};
        String st3 = new String(byteArray);
        System.out.println("st3= "+st3);

        System.out.println("st2==st3:" + st2==st3);


    }
}
