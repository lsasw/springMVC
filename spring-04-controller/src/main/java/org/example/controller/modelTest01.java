package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author lbenb
 * @version 1.0
 */
@Controller
public class modelTest01 {
    @RequestMapping("/t1/m1")
    public String test06(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //设置响应编码
        response.setCharacterEncoding("utf-8");

        //这个请求发出去以后，那么就可以从这个请求中获得很多信息
        HttpSession session = request.getSession();

        System.out.println(session.getId());

        //response.getWriter().println("hello");
        return "test";
    }

    @RequestMapping("/t1/m2")
    public void test07(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //这里使用通过HttpServletResponse实现转发，
        response.setCharacterEncoding("utf-8");
        //写不出来，就很奇怪
        response.getWriter().println("hello");
        //重定向---网址发生改变
        response.sendRedirect("/a.jsp");
    }

    @RequestMapping("/t1/m3")
    public String test08(Model model) {
        model.addAttribute("asg", "转发");
        return "redirect:/index.jsp";
    }
}
