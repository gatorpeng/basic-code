package cn.itcast.day07.demo06;

public class Demo01StaticField {
    public static void main(String[] args) {
//        Student one = new Student(12,"杨紫");
        Student one = new Student();
        one.setName("杨紫");
        one.setAge(12);
        one.room = "101 教室";
        System.out.println("姓名： " + one.getName()
                + "; 年龄：" + one.getAge()
                + "; 教室：" + one.room
                + "； 学号： "+one.getId());


        Student two = new Student(14,"刘星");

        System.out.println("姓名： " + two.getName()
                + "; 年龄：" + two.getAge()
                + "; 教室：" + two.room
                + "； 学号： "+two.getId());



    }
}
