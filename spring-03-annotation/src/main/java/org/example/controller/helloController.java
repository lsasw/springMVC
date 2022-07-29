package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lbenb
 * @version 1.0
 */
@Controller
//@RestController //不会被视图解析器解析，只返回字符串
//@RequestMapping("/ds")
public class helloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        //1. 封装数据
        model.addAttribute("msg", "hello,springMvcAnnotation");
        return "hello";//会被视图解析器处理
    }
}
