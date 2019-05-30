package com.inspur.dubbo.user.dao.impl;

import com.inspur.dubbo.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * User: YANG
 * Date: 2019/5/29-14:39
 * Description: No Description
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertUser() {
        jdbcTemplate.execute("INSERT INTO `user`(`username`) VALUES('Yang')");
    }
}
