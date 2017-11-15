package com.enjoyphoto.serivce;

import com.enjoyphoto.entity.webuser.WebUserEntity;

/**
 * Created by windy on 2017/11/6.
 */
public interface WebUserService {

    long createWebUser(WebUserEntity webUser);

    WebUserEntity getWebUserById(long webUserId);

    WebUserEntity getWebUserByLoginNameAndPassword(String loginName,String passWord);

    void deleteWebUserById(long webUserId);

    void updateWebUserById(WebUserEntity webUser);
}
