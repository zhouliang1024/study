package com.yuye.improve.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuye.improve.DO.UserDO;


/**
 * @Author: zhouliang
 * @Date: 2020/9/11 0:07
 */
public interface UserMapper extends BaseMapper<UserDO> {
    UserDO selectById(Long userId);
}
