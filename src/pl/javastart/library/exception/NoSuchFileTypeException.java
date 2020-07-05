package pl.javastart.library.exception;

public class NoSuchFileTypeException extends RuntimeException {

    public NoSuchFileTypeException(final String message) {
        super(message);
    }
}
