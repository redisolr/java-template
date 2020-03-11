package com.qtxln.template.commons.component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * mybatis plus 新加更新自动赋值
 *
 * @author qt
 * @version 1.0
 * @date 2020/3/11 4:09 下午
 * @since 1.0
 */
@Component
public class DateTimeMetaObjectHandler implements MetaObjectHandler {

  private static final String CREATE_TIME_NAME = "createTime";
  private static final String UPDATE_TIME_NAME = "updateTime";

  @Override
  public void insertFill(MetaObject metaObject) {
    this.strictInsertFill(metaObject, CREATE_TIME_NAME, LocalDateTime.class, LocalDateTime.now());
    this.strictInsertFill(metaObject, UPDATE_TIME_NAME, LocalDateTime.class, LocalDateTime.now());
  }

  @Override
  public void updateFill(MetaObject metaObject) {
    this.strictUpdateFill(metaObject, UPDATE_TIME_NAME, LocalDateTime.class, LocalDateTime.now());
  }

}
