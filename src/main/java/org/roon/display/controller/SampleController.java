package org.roon.display.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
    @GetMapping("/ex1")
    public String ex1(){
        return "ex1";
    }
}
