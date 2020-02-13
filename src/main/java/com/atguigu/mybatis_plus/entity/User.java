package com.atguigu.mybatis_plus.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
public class User {
   // @TableId(type = IdType.ID_WORKER)//默认值
    //@TableId(type = IdType.ID_WORKER_STR)//默认值
    //@TableId(type = IdType.AUTO)//默认值
    //@TableId(type = IdType.NONE)//默认值
    //@TableId(type = IdType.INPUT)//默认值
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    //用户信息被查看的次数
    private Integer viewCount;
    //乐观锁版本号
    @Version
    private Integer version;
    //逻辑删除字段
    @TableLogic
    private Integer deleted;
}

