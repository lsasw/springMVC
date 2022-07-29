package org.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lbenb
 * @version 1.0
 */
//被这个类注解的类，中的所有方法，如果返回值string，
//    并且有具体也页面可以跳转，那么就会被视图解析器解析：

@Controller //代表被spring接管
public class controllerTest02 {
    @RequestMapping("/test2")
    public String test2(Model model) {
        model.addAttribute("asg", "contest02");
        return "test"; //这里代表会找到 /WEB-INF/jsp/test.jsp, 由bean来拼接
    }

    //这里的视图就被复用了
    @RequestMapping("/test3")
    public String test3(Model model) {
        model.addAttribute("asg", "contest03");
        return "test"; //这里代表会找到 /WEB-INF/jsp/test.jsp, 由bean来拼接
    }
}
