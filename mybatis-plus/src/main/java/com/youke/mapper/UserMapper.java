package com.youke.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.youke.annotations.ServiceId;
import com.youke.entities.BaseModel;
import com.youke.entities.User;

import java.io.Serializable;

@ServiceId("userServiceId")
public interface UserMapper extends BaseMapper<User> {
    User getUserById(Serializable id);

    IPage<User> getUsers(Page page);

    IPage<User> getUsersByWrapper(Page page, Wrapper<User> wrapper);
}
