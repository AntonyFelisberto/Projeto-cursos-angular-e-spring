package com.example.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController                     //método que facilita as requisições e que resume o uso do @responseBody
@RequestMapping("/api/hello")   //url de requisição principal
public class HelloController {

    @GetMapping
    (method = {RequestMethod.})
    //É POSSIVEL ESPECIFICAR UM @RequestMapping com
    // @RequestMapping(method = RequestMethod.)
    public String hello(){
        return "hello world";
    }

}
