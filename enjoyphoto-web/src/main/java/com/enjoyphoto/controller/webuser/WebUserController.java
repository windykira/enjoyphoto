package com.enjoyphoto.controller.webuser;

import com.enjoyphoto.entity.webuser.WebUserEntity;
import com.enjoyphoto.serivce.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> a1ad3be3a4626bfd0d2d02e19891362de98a0703
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
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

    @RequestMapping("/show")
    public ModelAndView show() throws IOException
    {
        ModelAndView mav = new ModelAndView();
        /*WebUserEntity webUserEntity = new WebUserEntity();
        webUserEntity.setLoginName("test111");
        webUserEntity.setPassWord("123456");
        webUserEntity.setEmail("xxx@163.com");
        webUserEntity.setLogo("josfs2222bbbc");
        webUserEntity.setMobile("18015052006");
        webUserEntity.setUserName("测试");
        webUserEntity.setCreateDate(new Date());
        webUserEntity.setUpdateDate(new Date());
        webUserService.createWebUser(webUserEntity);*/
        mav.setViewName("show");
        //HttpSession session = request.getSession();
        //session.setAttribute("name", customer.getName());
        return mav;
    }

<<<<<<< HEAD
    @RequestMapping("/user")
    @ResponseBody
    public ModelAndView createUser(HttpServletRequest request) throws IOException
=======
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @ResponseBody
    public WebUserEntity createUser(HttpServletRequest request, WebUserEntity webUserEntity) throws IOException
>>>>>>> a1ad3be3a4626bfd0d2d02e19891362de98a0703
    {
        ModelAndView mav = new ModelAndView();
        /*WebUserEntity webUserEntity = new WebUserEntity();
        webUserEntity.setLoginName("test111");
        webUserEntity.setPassWord("123456");
        webUserEntity.setEmail("xxx@163.com");
        webUserEntity.setLogo("josfs2222bbbc");
        webUserEntity.setMobile("18015052006");
        webUserEntity.setUserName("测试");
        webUserEntity.setCreateDate(new Date());
        webUserEntity.setUpdateDate(new Date());
        webUserService.createWebUser(webUserEntity);*/
        mav.setViewName("success");
        //HttpSession session = request.getSession();
        //session.setAttribute("name", customer.getName());
        webUserEntity.setCreateDate(new Date());
        webUserEntity.setUpdateDate(new Date());
        webUserService.createWebUser(webUserEntity);
        return webUserEntity;
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @ResponseBody
    public WebUserEntity getWebUserById(HttpServletRequest request) throws IOException
    {
        String str = "";
        WebUserEntity webUserEntity = webUserService.getWebUserById(Long.valueOf(request.getParameter("userId")));
        return webUserEntity;
    }
}
