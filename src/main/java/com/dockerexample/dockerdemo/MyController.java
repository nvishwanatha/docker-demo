package com.dockerexample.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/test-docker")
public String getData()
    {
        return  "=============== In Docker Tutorial Project of Play Java=============";
    }

}
