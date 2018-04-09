package com.bysj;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by cz1996 on 2018/4/8.
 */

@Controller
public class WelcomeController {
    @RequestMapping("/")
    public ModelAndView welcome(){
        ModelAndView welcomeView = new ModelAndView();
        welcomeView.setViewName("/welcome/welcome");
        return welcomeView;
    }

    @RequestMapping("/index")
    public  ModelAndView vueTest(){
        ModelAndView vueView = new ModelAndView();
        vueView.setViewName("/project/indexPage");
        return vueView;
    }
}
