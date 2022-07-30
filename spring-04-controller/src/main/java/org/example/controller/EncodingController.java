package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lbenb
 * @version 1.0
 */
@Controller
public class EncodingController {
    //过滤器解决乱码问题
    @RequestMapping("/e/t1")
    public String test(String name, Model model) {

        model.addAttribute("asg", name);

        return "test";
    }
}
