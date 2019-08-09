package cn.itcast.day08.demo04;

public class Demo02StringCut {
    public static void main(String[] args) {
        String str1  = "aaa cccc ddd e";
        String[] split1 = str1.split(" ");
        for (int i = 0; i < split1.length; i++) {
            System.out.println(split1[i]);
        }

        System.out.println(split1.length);

        String str2 = "aaa.cdc.e.f.edc";
        String[] split2 = str1.split("c");

        for (int i = 0; i < split2.length; i++) {
            System.out.println(split2[i]);
        }
        System.out.println(split2.length);


    }
}
