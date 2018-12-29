package com.hwj.demo.mapper;

import com.hwj.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 贺文杰
 * 2018/12/25 9:26
 */
@Mapper
public interface UserMapper {
    @Select("select * from user_login")
    List<User> findall();
}
