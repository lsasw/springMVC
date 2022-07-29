package org.example.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lbenb
 * @version 1.0
 */
public class helloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
//        业务返回代码
        String result = "helloSpringMvc";
        mv.addObject("msg", result);
//视图跳转
        mv.setViewName("test");


        return mv;
    }

}
