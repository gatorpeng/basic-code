package cn.itcast.demo09.staticmethodreference;

public class DemoStaticMethodReference {
    public static int methodGetAbs(GetAbs abs) {
        return abs.getAbsolute(-2000);
    }

    public static void main(String[] args) {
        int i01 = methodGetAbs((int num) -> {
            return Math.abs(num);
        });
        System.out.println(i01);

        // simplify the lambda expression
        int i02 = methodGetAbs(num -> Math.abs(num));
        System.out.println(i02);

        // static method reference
        int i03 = methodGetAbs(Math::abs);
        System.out.println(i03);

    }
}
