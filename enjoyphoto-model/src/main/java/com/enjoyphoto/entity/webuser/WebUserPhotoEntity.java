package com.enjoyphoto.entity.webuser;

import com.enjoyphoto.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by windy on 2017/11/9.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebUserPhotoEntity extends BaseEntity{

    private long userId;
    private String photoUrl;
}
