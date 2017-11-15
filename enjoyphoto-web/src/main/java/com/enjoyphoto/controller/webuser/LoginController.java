package com.enjoyphoto.controller.webuser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/11/15.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request){


        return null;
    }
}
