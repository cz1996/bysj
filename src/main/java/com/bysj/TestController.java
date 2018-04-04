package com.bysj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cz1996 on 2018/4/4.
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "hello";
    }
}
