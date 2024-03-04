package SpringSecurityApp.example.demo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GrettingController {


    @GetMapping
    public ResponseEntity<String> sayHello()
    {
        return  new ResponseEntity<>("Spring Boot Security!!", HttpStatus.OK);
    }

    @GetMapping("/GoodBy")

    public ResponseEntity<String> sayGoodBy()
    {
        return new ResponseEntity<>("Good by see you later!",HttpStatus.OK);
    }



}
