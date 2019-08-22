package cn.itcast.demo01_exception;

public class Registration01Exception extends RuntimeException{

    public Registration01Exception() {
        super();
    }

    public Registration01Exception(String message) {
        super(message);
    }


}
