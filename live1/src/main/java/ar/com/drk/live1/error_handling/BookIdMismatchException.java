package ar.com.drk.live1.error_handling;

public class BookIdMismatchException extends RuntimeException {
  public BookIdMismatchException() {
    super();
  }
  public BookIdMismatchException(final String message, final Throwable cause) {
    super(message, cause);
  }
}