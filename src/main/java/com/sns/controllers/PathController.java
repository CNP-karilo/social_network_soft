package com.sns.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 请求路径的处理控制器
 * @Author Peiran Li
 * @CreateTime 2021-07-25 14:08
 * @Version 1.0.0
 */
@Controller
public class PathController {
    @GetMapping("/")
    public String index(){
        return "login";
    }
}
