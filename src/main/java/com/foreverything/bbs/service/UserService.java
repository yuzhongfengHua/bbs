package com.foreverything.bbs.service;

import com.foreverything.bbs.entities.User;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

/**
 * @ClassName UserService
 * @Author LiuJingxin
 * @Date Created in 19:17 2019/12/17
 * @Description
 */
public interface UserService {

     String getPas(int id);

     int insertUser(String username, String password, String mail);

     Boolean judgeUserByID(int id);

     int getIDByMail(String mail);

     String getPasswordByEmail(String mail);
}
