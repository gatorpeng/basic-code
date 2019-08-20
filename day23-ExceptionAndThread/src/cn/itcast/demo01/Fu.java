package cn.itcast.demo01;

public class Fu {

    public void method01() throws ArrayIndexOutOfBoundsException {}

    public void method02() throws NullPointerException{}

//    public void method03() throws IndexOutOfBoundsException{}

    public void method04() {}
}

class Zi extends Fu {
    public void method01() throws IndexOutOfBoundsException {}

    public void method02() throws NullPointerException {}

    public void method03() {}

    public void method04() {
        try {
            throw new Exception("The Exception");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
