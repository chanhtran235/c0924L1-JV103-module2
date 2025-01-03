package ss15_exception;


// custom exception => tự tạo ra môt exception
public class MyAgeException extends Exception{
    public MyAgeException(String message) {
        super(message);
    }
}
