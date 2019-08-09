package cn.itcast.day06.demo03;

public class Demo03StudentInfo {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("Lu Han");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("The name is " + stu.getName());
        System.out.println("The age is " + stu.getAge());
        System.out.println("The male is " + stu.isMale());

    }
}
