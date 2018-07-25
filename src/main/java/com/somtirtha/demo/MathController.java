package com.somtirtha.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
    private final String pi = "3.141592653589793";

    @GetMapping("/pi")
    public String getPi() {
        return pi;
    }

}
