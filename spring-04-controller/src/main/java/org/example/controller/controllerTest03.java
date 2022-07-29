package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lbenb
 * @version 1.0
 */
@Controller //加上注解，就会被spring接管
@RequestMapping("/test01")// 在加上一级路径
public class controllerTest03 {
    @RequestMapping("/test04")  //请求映射地址
    public String test04(Model model) {
        model.addAttribute("asg", "这里就会把你想要上传的信息，发给前端页面");
        return "test";
    }

}
