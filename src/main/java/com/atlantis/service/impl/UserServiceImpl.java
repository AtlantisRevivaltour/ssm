package com.atlantis.service.impl;

import com.atlantis.dao.IUserDao;
import com.atlantis.pojo.User;
import com.atlantis.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA
 * UserServiceImpl class
 * Description: 请添加描述。
 * User: Atlantis
 * Date: 16/9/5
 * Time: 下午12:40
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public User getUserById(int id) {
        return this.userDao.selectByPrimaryKey(id);
    }
}
