package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping( path="hello-world")
    public String helloWorld() {
        return "Hello World";
    }
    @GetMapping( path="helloBean")
    public HelloBean helloBean() {
        return new HelloBean("Hello World");
    }
    @GetMapping( path="helloworld/path-variable/{name}/{name2}/{name3}")
    public HelloBean helloBeanPathVariable(@PathVariable String name, @PathVariable String name2, @PathVariable String name3) {
        return new HelloBean("Hello World "+ name + "2: "+ name2+" 3: "+ name3);
    }
}
