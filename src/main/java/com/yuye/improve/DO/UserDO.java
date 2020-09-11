package com.yuye.improve.DO;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: zhouliang
 * @Date: 2020/9/11 0:08
 */
@Data
@TableName("sys_user")
public class UserDO implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long user_id;
    private String user_name;
}
