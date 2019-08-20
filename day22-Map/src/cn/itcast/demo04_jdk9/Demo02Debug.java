package cn.itcast.demo04_jdk9;
/*
* F8: step by step
* F9: go to the next break point
* ctrl+F2: exit
* F7: step into the method
* */
public class Demo02Debug {
    public static void main(String[] args) {
        int one = 10;
        int two = 20;
        int three =30;


        show();

        int four = 40;
        int five = 50;

        int count = four==five? 3:6;
        System.out.println(count);
    }

    private static void show() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }

}
