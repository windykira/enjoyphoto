package com.enjoyphoto.serivce.serviceimpl;

import com.enjoyphoto.dao.webuser.WebUserDao;
import com.enjoyphoto.entity.webuser.WebUserEntity;
import com.enjoyphoto.serivce.WebUserService;
import com.enjoyphoto.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by windy on 2017/11/6.
 */
@Service
public class WebUserServiceImpl implements WebUserService {

    @Autowired
    WebUserDao webUserDao;

    public long createWebUser(WebUserEntity webUser) throws UnsupportedEncodingException,
            NoSuchAlgorithmException {

        String alt = MD5Util.getRandomStr(6);
        webUser.setPassWord(MD5Util.EncoderByMd5(webUser.getPassWord(),alt));
        webUser.setAlt(alt);
        webUserDao.createWebUser(webUser);
        return webUser.getId();
    }

    public WebUserEntity getWebUserById(long webUserId) {
        WebUserEntity webUserEntity = webUserDao.getWebUserById(webUserId);
        return webUserEntity;
    }

    public WebUserEntity getWebUserByLoginNameAndPassword(String loginName, String passWord) {
        return null;
    }

    public void deleteWebUserById(long webUserId) {
        webUserDao.deleteWebUserById(webUserId);
    }

    public void updateWebUserById(WebUserEntity webUser) {
        webUserDao.updateWebUserById(webUser);
    }
}
