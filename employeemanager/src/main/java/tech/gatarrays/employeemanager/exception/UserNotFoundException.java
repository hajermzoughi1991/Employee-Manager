package tech.gatarrays.employeemanager.exception;

public class UserNotFoundException extends RuntimeException{
    //usernotfoundexception will send the message to runtimeexception
    public UserNotFoundException(String message) {
        super(message);
    }
}
