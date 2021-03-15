package com.fujinjin.river.dao.mapper;

import com.fujinjin.river.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

@Mapper//指定这是一个操作数据库的mapper
@Repository
public interface UserMapper {
    List<User> findAll();
}
