package cn.itcast.day08.demo02;

public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Abc";
        String str2 = "Abc";

        char[] charArray = {'A', 'b', 'c'};
        String str3 = new String(charArray);

        byte[] byteArray = {65, 98, 99};
        String str4 = new String(byteArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println("Abc".equals(str3));
        System.out.println("Abc".equals(str4));
        System.out.println("====================");

        String str5 = "abc";
        System.out.println(str1.equals(str5));
        System.out.println("不区分大写小写的话：" + str1.equalsIgnoreCase(str5));

        System.out.println(str1.length());


        String str6 = str1.concat("def");
        System.out.println(str6);

        System.out.println(str6.charAt(1));
        System.out.println(str6.indexOf("cde"));
        System.out.println(str1.indexOf("amd"));

        String strA = "HelloWorld";
        String strB = strA.substring(2);
        System.out.println(strB);

        String strC = strA.substring(2, 3);
        System.out.println(strC);


    }
}
