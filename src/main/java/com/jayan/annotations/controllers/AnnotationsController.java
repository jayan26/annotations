package com.jayan.annotations.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnnotationsController {

@GetMapping
public String start(){
    return "hello";
}

}
