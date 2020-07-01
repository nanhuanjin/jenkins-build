package com.breeze.jenkins.build.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author breeze
 * @date 2020/7/1
 */
@RestController
public class JenkinsController {

    @GetMapping("/access")
    public String access() {
        return "访问成功！";
    }
}
