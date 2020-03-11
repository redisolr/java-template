package com.qtxln.template.service;

import com.qtxln.template.model.entity.User;

import java.util.List;

/**
 * 用户接口服务
 *
 * @author qt
 * @version 1.0
 * @date 2020/3/11 4:37 下午
 * @since 1.0
 */
public interface UserService {

  boolean batchSave(List<User> users);

  User findOneById(String id);

  User findOneByUserAge(Integer age);

  Long save(User user);

}
