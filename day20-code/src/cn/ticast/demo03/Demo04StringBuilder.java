package cn.ticast.demo03;

public class Demo04StringBuilder {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("str: " + str);
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
        sb.append("World");
        System.out.println(sb);
        String str2 = sb.toString();
        System.out.println(str2);

    }
}
