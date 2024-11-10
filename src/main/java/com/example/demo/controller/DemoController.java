package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
// /api
//@RequestMapping("/api")
public class DemoController {

    // Maps HTTP GET requests to "/hello" URL to this method, so when someone visits "/hello", it returns "Hello Yousef"
    // /api/hello
//    @GetMapping("/hello")
//    String hello(@RequestParam(required = false) Integer id) {
//        return "Hello " + id;
//    }
//
//    @GetMapping("/bye/{name}/{age}/{id}")

//    String bye(@PathVariable String name, @PathVariable Integer id, @PathVariable Integer age) {
//        return "Bye " + name + "( ID:" + id + ")" + " your age is " + age;
//    }
//
//    @GetMapping("/hola")
//    String hola(@RequestParam String name) {
//        return "Hello " + name;
//    }

//    @GetMapping("/hola")
//    String hola(@PathVariable String name) {

    // http://localhost:8080/greet/yousef

//        return "Hello " + name;
//    }


    @GetMapping("/greet")
    String greet(@RequestParam String name) {

//        http://localhost:8080/greet?name=yousef

        return "Hello " + name;
    }

    @PostMapping("/farewell")
    String farewell(@RequestBody Person person) {
        return person.name;
    }

// TO MAKE TO STRING JSON
//    @PostMapping("/farewell")
//    Person farewell(@RequestBody Person person) {
//        return person;
//    }

}
