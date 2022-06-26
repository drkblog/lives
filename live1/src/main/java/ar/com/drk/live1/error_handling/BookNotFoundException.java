package ar.com.drk.live1.error_handling;

public class BookNotFoundException extends RuntimeException {
  public BookNotFoundException() {
    super();
  }
  public BookNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}