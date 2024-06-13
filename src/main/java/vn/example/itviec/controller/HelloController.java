package vn.example.itviec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.example.itviec.service.error.IdInvalidException;

@RestController
public class HelloController {
    

    @GetMapping("/")
    public String getHelloWorld() throws IdInvalidException {
        if (true)
            throw new IdInvalidException("check");
        return ("hello");
    }
}
