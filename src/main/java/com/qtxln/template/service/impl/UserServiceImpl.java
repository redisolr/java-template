package com.qtxln.template.service.impl;

import cn.hutool.core.lang.Assert;
import com.qtxln.template.mapper.UserMapper;
import com.qtxln.template.model.entity.User;
import com.qtxln.template.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户实现服务
 *
 * @author qt
 * @version 1.0
 * @date 2020/3/11 4:41 下午
 * @since 1.0
 */
@Service
public class UserServiceImpl implements UserService {
  private final UserMapper userMapper;

  public UserServiceImpl(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  @Override
  public boolean batchSave(List<User> users) {
    return false;
  }

  @Override
  public User findOneById(String id) {
    Assert.notNull(id, "id不能为NULL");
    return null;
  }

  @Override
  public User findOneByUserAge(Integer age) {
    return null;
  }

  @Override
  public Long save(User user) {
    return null;
  }
}
