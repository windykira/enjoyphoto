package com.enjoyphoto.entity.webuser;

import com.enjoyphoto.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Administrator on 2017/11/13.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebUserFrinedEntity extends BaseEntity {

    private long userId;
    private long frinedId;
}

