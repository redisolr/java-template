package com.qtxln.template.model.po;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 用户描述PO
 *
 * @author qt
 * @version 1.0
 * @date 2020/3/11 4:35 下午
 * @since 1.0
 */
@Data
@AllArgsConstructor
public class UserDescriptionPO {

  private static final long serialVersionUID = 1905122041950251207L;
  private String desc;
  private String remark;

}
