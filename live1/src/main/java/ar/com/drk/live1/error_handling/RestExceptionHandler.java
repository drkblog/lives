package ar.com.drk.live1.error_handling;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler({ BookNotFoundException.class })
  protected ResponseEntity<Object> handleNotFound(
      final Exception ex, final WebRequest request) {
    return handleExceptionInternal(ex, "Book not found",
        new HttpHeaders(), HttpStatus.NOT_FOUND, request);
  }

  @ExceptionHandler({ BookIdMismatchException.class,
      ConstraintViolationException.class,
      DataIntegrityViolationException.class })
  public ResponseEntity<Object> handleBadRequest(
      final Exception ex, final WebRequest request) {
    return handleExceptionInternal(ex, ex.getLocalizedMessage(),
        new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
  }
}