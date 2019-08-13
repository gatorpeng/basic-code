package cn.itcast.day11.demo03;

import org.w3c.dom.ls.LSOutput;

public class Outer {

    int num = 10;

    public void methodOuter() {
        int num = 20;



        class Inner{
//            int num = 30;

            public void methodInner() {
                System.out.println(num);
//                System.out.println(this.num);
//                System.out.println(num);
            }
        }

        Inner inner = new Inner();
        inner.methodInner();

    }
}
