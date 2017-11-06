package com.enjoyphoto.controller.webuser;

import com.enjoyphoto.entity.webuser.WebUserEntity;
import com.enjoyphoto.serivce.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.Date;

/**
 * Created by windy on 2017/11/6.
 */
@Controller
@RequestMapping("/webUser")
public class WebUserController {

    @Autowired
    WebUserService webUserService;

    @RequestMapping("/user")
    public ModelAndView createUser() throws IOException
    {
        ModelAndView mav = new ModelAndView();
        WebUserEntity webUserEntity = new WebUserEntity();
        webUserEntity.setLoginName("test111");
        webUserEntity.setPassWord("123456");
        webUserEntity.setEmail("xxx@163.com");
        webUserEntity.setLogo("josfs2222bbbc");
        webUserEntity.setMobile("18015052006");
        webUserEntity.setUserName("测试");
        webUserEntity.setCreateDate(new Date());
        webUserEntity.setUpdateDate(new Date());
        webUserService.createWebUser(webUserEntity);
        mav.setViewName("show");
        //HttpSession session = request.getSession();
        //session.setAttribute("name", customer.getName());
        return mav;
    }
}
