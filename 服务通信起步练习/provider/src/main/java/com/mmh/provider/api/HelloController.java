package com.mmh.provider.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mingle
 * @date 2022/8/30 20:44
 */
@RestController
@RequestMapping(value = "/api")
public class HelloController {
    @GetMapping("hello")
    public String getHello() {
        return "hello world";
    }
}
