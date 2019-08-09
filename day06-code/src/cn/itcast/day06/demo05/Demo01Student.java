package cn.itcast.day06.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("赵丽颖");
        stu.setAge(21);
        System.out.println("姓名：" + stu.getName());
        System.out.println("Age: " + stu.getAge() );
        System.out.println("=====================");

        Student stu2 = new Student("古力娜扎",23);
        System.out.println("姓名：" + stu2.getName());
        System.out.println("Age: " + stu2.getAge() );
        System.out.println("=====================");

        stu2.setAge(29);


    }
}
