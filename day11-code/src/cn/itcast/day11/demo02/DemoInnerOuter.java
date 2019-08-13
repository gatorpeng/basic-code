package cn.itcast.day11.demo02;

public class DemoInnerOuter {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();
    }
}
