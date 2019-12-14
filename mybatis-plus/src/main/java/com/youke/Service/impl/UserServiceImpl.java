package com.youke.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youke.Service.UserService;
import com.youke.entities.BaseModel;
import com.youke.entities.User;
import com.youke.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
