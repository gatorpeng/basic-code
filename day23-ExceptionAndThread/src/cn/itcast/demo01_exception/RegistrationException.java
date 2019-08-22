package cn.itcast.demo01_exception;

public class RegistrationException extends Exception{

    public RegistrationException() {
        super();
    }

    public RegistrationException(String message) {
        super(message);
    }


}
