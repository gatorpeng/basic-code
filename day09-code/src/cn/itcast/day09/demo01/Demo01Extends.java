package cn.itcast.day09.demo01;

public class Demo01Extends {
    public static void main(String[] args){
        Teacher teacher = new Teacher();
        teacher.method();
        System.out.println(teacher.numFu);

        Assistant assistant = new Assistant();
        assistant.method();

        Employee employee = new Employee();
        employee.method();
        System.out.println(employee.numFu);

        System.out.println(teacher.num);

        teacher.methodZi();



    }
}
