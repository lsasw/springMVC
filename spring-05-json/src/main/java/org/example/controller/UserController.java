package org.example.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.SneakyThrows;
import org.example.pojo.User;
import org.example.utils.JsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author lbenb
 * @version 1.0
 */
@Controller
//@RestController // 只会返回一个字符串
public class UserController {
    @RequestMapping("/g1")
    @ResponseBody  // 作用：不会走视图解析器 会直接返回一个字符串
    public String json1() throws JsonProcessingException {

        ObjectMapper objm = new ObjectMapper();

        User user = new User(12, "qwqw", 123);

        return objm.writeValueAsString(user);
    }


    @RequestMapping("/g2")
    @ResponseBody  // 作用：不会走视图解析器 会直接返回一个字符串
    public String json2(){

        Date date = new Date();
        return JsonUtil.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }



    @RequestMapping("/g3")
    @ResponseBody  // 作用：不会走视图解析器 会直接返回一个字符串
    public String json3() {

        List<User> userList = new ArrayList<User>();

        User user1 = new User(112, "qwqw", 123);
        User user2 = new User(122, "qwqw", 123);
        User user3 = new User(132, "qwqw", 123);
        User user4 = new User(142, "qwqw", 123);
        User user5 = new User(152, "qwqw", 123);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);


        return JsonUtil.getJson(userList);
    }


}
