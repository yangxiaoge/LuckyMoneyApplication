package com.bruceyang.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yangxiaoge
 * 2019/5/10 13:48
 *
 * @Controller + @ResponseBody = @RestController
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    //获取配置文件application中的limit
    @Autowired
    private LimitConfig limitConfig;

    @PostMapping("/say")
    @ResponseBody
    public String sayHello(@RequestParam(value = "id", required = false,defaultValue = "0") Integer id) {
//        return "说明: " + limitConfig.getDescription();
        return "id: " + id;
    }
}
