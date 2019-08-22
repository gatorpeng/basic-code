package cn.itcast.demo01_exception;

import java.util.Scanner;

public class Demo08CreateAAccountUsingRuntime {
    static String[] userNameDataBase = {"volvo","toyota","honda","ford"};
    public static void main(String[] args){
        System.out.print("Username: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        checkUserName(userName);
    }

    /*public static void checkUserName(String userName) throws RegistrationException {
        for (String s : userNameDataBase) {
            if (s.equals(userName)) {
                throw new RegistrationException("This username has been taken. Try another.");
            }
        }
        System.out.println("The new account has been created!");
    }*/

    public static void checkUserName(String userName) {
        for (String s : userNameDataBase) {
            if (s.equals(userName)) {
                    throw new Registration01Exception("This username has been taken. Try another.");
            }
        }
        System.out.println("The new account has been successfully created!");
    }
}
