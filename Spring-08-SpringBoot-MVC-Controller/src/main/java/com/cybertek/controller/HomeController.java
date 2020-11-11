package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/cybertek")
    public String getRequestMapping2(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/ozzy")
    public String getRequestMapping3(){
        return "home";
    }

    @GetMapping("/spring")
    public String getMappingEx(){
        return "home";
    }

    @PostMapping("/ozzy")
    public String getMappingEx2(){
        return "home";
    }

    @GetMapping("home/{name}")
    public String pathVariableEx(@PathVariable("name") String name) {
        System.out.println("Name is " + name);
        return "home";
    }

    @GetMapping("home/{name}/{email}")
    public String pathVariableEx(@PathVariable("name") String name, @PathVariable("email") String email) {
        System.out.println("Name is " + name);
        System.out.println("Email is " + email);
        return "home";
    }

    @GetMapping("home/course")
    public String requestParamEx(@RequestParam("course") String course) {
        System.out.println("name is " + course);
        return "home";
    }

    @GetMapping(value="home/course2")
    public String requestParamEx2(@RequestParam(value="course2",required = false, defaultValue = "Cybertek") String name) {
        System.out.println("name is " + name);
        return "home";
    }
}
