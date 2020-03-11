package com.qtxln.template.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qtxln.template.model.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户持久化层dao
 *
 * @author qt
 * @version 1.0
 * @date 2020/3/11 4:27 下午
 * @since 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

  @Select("SELECT * FROM mp_user ${ew.customSqlSegment}")
  List<User> selectAll(@Param(Constants.WRAPPER) Wrapper<User> wrapper);

  List<User> selectAll2(@Param(Constants.WRAPPER) Wrapper<User> wrapper);

  IPage<User> selectAll3(Page<User> page);

}
