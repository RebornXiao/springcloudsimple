package com.forezp.mapper;

import com.forezp.model.User;

/**
 * Created by 肖建伟 on 2017/11/14.
 */
public interface UserMapper {
    User getUserId(Long id);

    int insert(User user);
}
