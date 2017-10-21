package com.demo.springmvc.controller;

import com.demo.springmvc.domain.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome() {
        return "Hello Spring Lyft";
    }

    @RequestMapping(value = "/hello/{userName}", method = RequestMethod.GET)
    public Message helloMessage(@PathVariable String userName) {
        return new Message(userName, "Hello" + userName);
    }
}
