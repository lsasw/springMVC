package org.example.controller;

import org.example.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lbenb
 * @version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    public String test09(@RequestParam("username") String name, Model model) {
// 1.接收前端参数,没有加注解时，要保证name一致
        System.out.println("接收的前端参数为："+name);

// 2.将返回来的结果传给前端,model 利用它来传递参数
        model.addAttribute("asg", name);
//  3. 视图跳转
        return "test";
    }

    //    前端提交一个对象
    @RequestMapping("/t2")
    public String test12(User user) {
        System.out.println(user);
        return "test";
    }

    //modelMap
    @RequestMapping("/t3")
    public String test13(ModelMap map) {
        map.addAttribute("asg","map");
        return "test";
    }
}
