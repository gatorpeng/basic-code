package cn.itcast.demo02_recursion;

public class Demo01Recursion {
    public static void main(String[] args) {
//        a();
        b(0);
    }



    private static void b(int i) {
        if (i==10000){
            return;
        }
        System.out.println(i);
        b(++i);

    }

    private static void a() {
        System.out.println("method a");
        a();

    }
}
