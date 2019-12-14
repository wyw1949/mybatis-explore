package com.youke.entities;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.youke.annotations.ServiceId;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("user")
@ServiceId("userServiceId")
public class User extends BaseModel<User> {
    private Long id;
    @JSONField(name = "name_")
    private String name;
    @JSONField(name = "age_")
    private Integer age;
    @JSONField(name = "email_")
    private String email;
}
