package com.wanglu;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by wangl on 2017/10/12 0012.
 */
public class Girl {

    @NotNull(message = "主键不能为空")
    private Integer id;

    @NotNull(message = "cupSize不能为空")
    @Size(min = 1, max = 2, message = "cupSize长度需要在1和2之间")
    private String cupSize;

    @NotNull(message = "年龄不能为空")
    @Min(value = 18, message = "未成年禁止入内")
    private Integer age;

    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age;
    }
}
