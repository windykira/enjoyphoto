package com.enjoyphoto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by windy on 2017/11/6.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/show")
    public ModelAndView findCustomerById(HttpServletRequest request, HttpServletResponse response, Model model) throws IOException
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("show");
        //HttpSession session = request.getSession();
        //session.setAttribute("name", customer.getName());
        return mav;
    }
}
