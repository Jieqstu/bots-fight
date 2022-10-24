package com.bf.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bf.backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
