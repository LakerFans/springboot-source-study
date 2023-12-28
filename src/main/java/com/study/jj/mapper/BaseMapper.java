package com.study.jj.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.study.jj.bean.SysUser;

@Repository
public interface BaseMapper {
    @Select("select * from sys_user where id = #{id}")
    SysUser getById(@Param("id") int id);

    @Insert("insert into sys_user (username,password) values ('jj','123456')")
    int addUser();

    @Insert("insert into account (name,balance) values ('jj','1000')")
    int addAccount();
}
