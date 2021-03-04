package my_exception;

import java.io.IOException;

public class InvalidOperationException extends IOException {

    public InvalidOperationException(String message) {
        super(message);
    }

}
