package com.enjoyphoto.serivce.serviceimpl;

import com.enjoyphoto.dao.webuser.WebUserDao;
import com.enjoyphoto.entity.webuser.WebUserEntity;
import com.enjoyphoto.serivce.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by windy on 2017/11/6.
 */
@Service
public class WebUserServiceImpl implements WebUserService {

    @Autowired
    WebUserDao webUserDao;

    public long createWebUser(WebUserEntity webUser) {
        int addKey = webUserDao.createWebUser(webUser);
        return webUser.getId();
    }

    public WebUserEntity getWebUserById(long webUserId) {
        WebUserEntity webUserEntity = webUserDao.getWebUserById(webUserId);
        return webUserEntity;
    }

    public void deleteWebUserById(long webUserId) {
        webUserDao.deleteWebUserById(webUserId);
    }

    public void updateWebUserById(WebUserEntity webUser) {
        webUserDao.updateWebUserById(webUser);
    }
}
