package com.qtxln.template.model.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 业务实体基础类-建表必建5个字段
 *
 * @author qt
 * @version 1.0
 * @date 2020/3/11 4:29 下午
 * @since 1.0
 */
@Data
public class BaseEntity {

  /**
   * 创建时间 非null
   */
  @TableField(fill = FieldFill.INSERT)
  private LocalDateTime createTime;
  /**
   * 创建用户id 可null
   */
  private String createUser;
  /**
   * 是否删除
   * true ：删除
   * false：没有删除
   */
  @TableLogic
  @TableField(select = false)
  private Boolean deleted;
  /**
   * 更新时间 可null
   */
  @TableField(fill = FieldFill.INSERT_UPDATE)
  private LocalDateTime updateTime;
  /**
   * 更新用户id 可null
   */
  private String updateUser;

}
