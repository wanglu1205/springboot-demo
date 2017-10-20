package com.wanglu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by wangl on 2017/10/12 0012.
 */
@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;


    @GetMapping(value = {"/hello", "/hi"})
    public Integer say(){
        return girlProperties.getAge()+1;
    }

    @GetMapping(value = "/getGirl")
    public Result getGirl(@Valid Girl girl, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            throw new MacroApiException(bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtil.success(girl.toString());
    }
}
