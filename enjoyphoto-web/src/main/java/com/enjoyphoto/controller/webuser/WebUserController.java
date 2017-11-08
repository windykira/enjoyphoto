package com.enjoyphoto.controller.webuser;

import com.enjoyphoto.entity.base.AjaxResult;
import com.enjoyphoto.entity.webuser.WebUserEntity;
import com.enjoyphoto.serivce.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @ResponseBody
    public WebUserEntity createUser(WebUserEntity webUserEntity) throws IOException
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
        webUserService.createWebUser(webUserEntity);
        mav.setViewName("success");*/
        //HttpSession session = request.getSession();
        //session.setAttribute("name", customer.getName());
        webUserEntity.setCreateDate(new Date());
        webUserEntity.setUpdateDate(new Date());
        webUserService.createWebUser(webUserEntity);
        return webUserEntity;
    }

    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    @ResponseBody
    public AjaxResult deleteWebUser(HttpServletRequest request) throws IOException
    {
        webUserService.deleteWebUserById(Long.valueOf(request.getParameter("userId")));
        AjaxResult ajaxResult = new AjaxResult();
        return ajaxResult.success();
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    @ResponseBody
    public AjaxResult updateWebUser(HttpServletRequest request) throws IOException
    {
        AjaxResult ajaxResult = new AjaxResult();
        return ajaxResult.success();
    }

    @RequestMapping(value = "/user/{userId}",method = RequestMethod.GET)
    @ResponseBody
    public WebUserEntity getWebUserById(@PathVariable String userId) throws IOException
    {
        WebUserEntity webUserEntity = webUserService.getWebUserById(Long.valueOf(userId));
        return webUserEntity;
    }
}
