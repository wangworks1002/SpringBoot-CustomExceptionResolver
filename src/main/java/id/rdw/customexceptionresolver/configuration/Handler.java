package id.rdw.customexceptionresolver.configuration;

import id.rdw.customexceptionresolver.exception.YourException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class Handler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> exceptionHandler (Exception ex, HttpServletRequest request){
        if (ex instanceof YourException){
            return ResponseEntity.ok(ex.getMessage());
        } else if (ex instanceof NoHandlerFoundException || ex instanceof HttpRequestMethodNotSupportedException) {
            return ResponseEntity.ok("No Matching Method and Endpoint Found");
        }
        return ResponseEntity.ok("Error");
    }
}
