package com.ning.dao;

import com.ning.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where id = #{id}")
    User findById(Integer id);

    @Update("update user set username = #{username},password = #{password},email = #{email},sex = #{sex},age = #{age} where id = #{id}")
    void update(User user);
}
