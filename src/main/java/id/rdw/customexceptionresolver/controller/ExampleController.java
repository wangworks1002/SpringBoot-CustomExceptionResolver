package id.rdw.customexceptionresolver.controller;

import id.rdw.customexceptionresolver.exception.YourException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class ExampleController {

    @PostMapping("/endpoint")
    public ResponseEntity<?> testEndpoint(){
        return ResponseEntity.ok("Success");
    }

    @PostMapping("/trigger-your-exception")
    public ResponseEntity<?> triggerYourException(){
        throw new YourException("something");
    }
}
