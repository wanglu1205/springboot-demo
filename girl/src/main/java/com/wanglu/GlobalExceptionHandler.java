package com.wanglu;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wangl on 2017/10/16 0016.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /***
     * 服务器参数异常
     * @param request
     * @param response
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value=MacroApiException.class)
    public Result handlerApiException(HttpServletRequest request, HttpServletResponse response, Exception ex){
        return ResultUtil.error(1, ex.getLocalizedMessage());
    }
}
