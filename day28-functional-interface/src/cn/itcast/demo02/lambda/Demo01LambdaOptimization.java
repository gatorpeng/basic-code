package cn.itcast.demo02.lambda;

public class Demo01LambdaOptimization {
    public static void showMessage(int level, MessageBuilder messageBuilder) {
        if (level==1) {
            System.out.println(messageBuilder.buildMessage());
        }
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Java";

        showMessage(2,()->{
            System.out.println("the lambda expression");
            return str1+str2+str3;});
    }
}
