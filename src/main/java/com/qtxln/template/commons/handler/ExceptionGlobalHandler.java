package com.qtxln.template.commons.handler;

import com.qtxln.template.commons.constants.SystemCodeConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
 * 全局异常处理
 *
 * @author qt
 * @version 1.0
 * @date 2020/3/11 4:24 下午
 * @since 1.0
 */
@Slf4j
@RestControllerAdvice

public class ExceptionGlobalHandler {
  @ExceptionHandler(Exception.class)
  protected void handleException(Exception ex) {
    //业务异常
//    if (ex instanceof BaseException) {
//      BaseException bs = (BaseException) ex;
//
//      log.warn(bs.getBusinessDes(), ex);
//
//      return bs.getResponse();
//    }

    //参数异常
    if (ex instanceof MethodArgumentNotValidException) {
      StringBuilder sb = new StringBuilder();

      BindingResult bindingResult = ((MethodArgumentNotValidException) ex).getBindingResult();
      if (bindingResult.hasErrors()) {
        List<ObjectError> errorList = bindingResult.getAllErrors();
        errorList.forEach(error -> {
          FieldError fieldError = (FieldError) error;
          sb.append(fieldError.getField() + ":" + fieldError.getDefaultMessage() + ";");
        });
      }

      log.warn(sb.toString(), ex);
      //return ResponseExtKt.response(SystemCodeConstants.C400, sb.toString());
    }

    if (ex instanceof IllegalArgumentException) {
      IllegalArgumentException illegalArgumentException = (IllegalArgumentException) ex;
      log.warn("参数异常", ex);
      //return ResponseExtKt.response(SystemCodeConstants.C400, PropsUtils.getByKey(SystemCodeConstants.C400.toString(), illegalArgumentException.getMessage()));
    }

    //其他异常
    log.error("系统异常", ex);
    //return ResponseExtKt.response(SystemCodeConstants.C500, PropsUtils.getByKey(SystemCodeConstants.C500.toString(), ex.getMessage()));
  }

}
