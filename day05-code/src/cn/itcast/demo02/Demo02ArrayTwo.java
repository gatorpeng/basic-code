package cn.itcast.demo02;

public class Demo02ArrayTwo {
    public static void main(String[] args) {

        System.out.println("======Array A=======");
//        int[] ArrayA = new int[3];
        int[] ArrayA = new int[] {12, 10,30};
        System.out.println(ArrayA);
        System.out.println(ArrayA[0]);
        System.out.println(ArrayA[1]);
        System.out.println(ArrayA[2]);



        System.out.println("======Array A=======");
        ArrayA[1] = 10;
        ArrayA[2] = 20;
        System.out.println(ArrayA);
        System.out.println(ArrayA[0]);
        System.out.println(ArrayA[1]);
        System.out.println(ArrayA[2]);

        System.out.println("=======Array A======");
        int[] ArrayB = ArrayA;
        System.out.println(ArrayB);
        System.out.println(ArrayB[0]);
        System.out.println(ArrayB[1]);
        System.out.println(ArrayB[2]);

        System.out.println("=======Array B====");
        ArrayB[1] = 100;
        ArrayB[2] = 200;
        System.out.println(ArrayB);
        System.out.println(ArrayB[0]);
        System.out.println(ArrayB[1]);
        System.out.println(ArrayB[2]);


        System.out.println("=======Array A=======");
        System.out.println(ArrayA[1]);
        System.out.println(ArrayA[2]);
    }
}
