package com.enjoyphoto.controller.webuser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/15.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> login(HttpServletRequest request){

        Map<String,Object> map = new HashMap();
        map.put("isSuccess",true);
        return map;
    }
}
