package uk.ac.westminster.products_api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl {

    @GetMapping("/hello")

    public String hello(){
        return "Hello from Spring Boot!";
    }

    @GetMapping("/status")

    public String status(){
        return "Status Check! Springboot is working!";

    }

    @GetMapping("/goodbye")

    public String goodbye(){
        return "Good Bye From Springboot";

    }


}
