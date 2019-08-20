package cn.itcast.demo01;

import java.util.Scanner;

public class Demo07CreateAAccount {
    static String[] userNameDataBase = {"volvo","toyota","honda","ford"};
    public static void main(String[] args){
        System.out.print("Username: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        boolean b = checkUserName(userName);
        while (!b) {
            System.out.println("Try another username: ");
            userName = scanner.next();
            b = checkUserName(userName);
        }


    }

    /*public static void checkUserName(String userName) throws RegistrationException {
        for (String s : userNameDataBase) {
            if (s.equals(userName)) {
                throw new RegistrationException("This username has been taken. Try another.");
            }
        }
        System.out.println("The new account has been created!");
    }*/

    public static boolean checkUserName(String userName) {
        for (String s : userNameDataBase) {
            if (s.equals(userName)) {
                try {
                    throw new RegistrationException("This username has been taken. Try another.");
                } catch (RegistrationException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }
        System.out.println("The new account has been successfully created!");
        return true;
    }
}
