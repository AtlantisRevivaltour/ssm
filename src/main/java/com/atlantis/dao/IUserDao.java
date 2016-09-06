package com.atlantis.dao;

import com.atlantis.pojo.User;

/**
 * Created by IntelliJ IDEA
 * IUserDao class
 * Description: 请添加描述。
 * User: Atlantis
 * Date: 16/9/5
 * Time: 下午12:30
 */

public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
