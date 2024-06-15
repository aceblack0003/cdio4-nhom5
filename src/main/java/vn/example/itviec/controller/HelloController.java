package vn.example.itviec.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.example.itviec.util.error.IdInvalidException;

@RestController
public class HelloController {
    

    @GetMapping("/")
    public String getHelloWorld() throws IdInvalidException {
        
        return ("hello");
    }
}
