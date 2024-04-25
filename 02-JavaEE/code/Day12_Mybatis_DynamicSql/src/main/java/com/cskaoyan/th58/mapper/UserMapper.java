package com.cskaoyan.th58.mapper;

import com.cskaoyan.th58.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> selectByCondition(@Param("username") String username,@Param("id") Integer id,@Param("phone") String phone);

    List<User> selectByCondition2(@Param("username") String username, @Param("phone") String phone, @Param("email") String email, @Param("password")String password);

    List<User> selectAll();

    List<User> selectByCondition3(User user);

    void updateUserById(User user);

    void updateUserById2(@Param("u") User user);

    void updateUserById3(User user);

    void insertUsers(List<User> users);
}