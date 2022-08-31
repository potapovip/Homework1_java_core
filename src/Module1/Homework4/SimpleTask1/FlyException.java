package Module1.Homework4.SimpleTask1;

public class FlyException extends Exception{

    public FlyException() {
        super();
    }

    public FlyException(String message) {
        super(message);
    }

    public FlyException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlyException(Throwable cause) {
        super(cause);
    }

    protected FlyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
