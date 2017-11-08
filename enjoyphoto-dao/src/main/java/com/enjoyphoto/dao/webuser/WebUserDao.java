package com.enjoyphoto.dao.webuser;

import com.enjoyphoto.entity.webuser.WebUserEntity;

/**
 * Created by windy on 2017/11/6.
 */
public interface WebUserDao {

    int createWebUser(WebUserEntity webUser);

    WebUserEntity getWebUserById(long webUserId);

    void deleteWebUserById(long webUserId);
}
