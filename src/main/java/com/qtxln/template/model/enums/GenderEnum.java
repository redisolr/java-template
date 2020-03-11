package com.qtxln.template.model.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * 性别
 *
 * @author qt
 * @version 1.0
 * @date 2020/3/11 4:32 下午
 * @since 1.0
 */
public enum GenderEnum implements IEnum<Integer> {
  DEFAULT(0, "未知"), MAN(1, "男"), WOMAN(2, "女");

  //@EnumValue
  private final int code;
  private final String descp;

  GenderEnum(int code, String descp) {
    this.code = code;
    this.descp = descp;
  }

  @Override
  public Integer getValue() {
    return this.code;
  }

  @Override
  public String toString() {
    return Integer.toString(this.code);
  }

}
