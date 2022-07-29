package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author lbenb
 * @version 1.0
 */
@Controller
public class RestFulController {

    @GetMapping("/add/{a}/{b}")
//原来的方式
    public String test05(@PathVariable int a, @PathVariable int b, Model model) {
        int res= a+b;//这里需要访问路径上**/?a=2&b=3
        model.addAttribute("asg", "restful风格,结果1为："+res);
        return "test";
    }

    @DeleteMapping ("/add/{a}/{b}")
    public String test06(@PathVariable int a, @PathVariable int b, Model model) {
        int res= a+b;//这里需要访问路径上**/?a=2&b=3
        model.addAttribute("asg", "restful风格,结果2为："+res);
        return "test";
    }
}