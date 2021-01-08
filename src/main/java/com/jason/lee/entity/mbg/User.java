package com.jason.lee.entity.mbg;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* @author huanli9
* @description
* @date 2021/1/8 16:58
*/

@ApiModel(value="com-jason-lee-entity-mbg-User")
@Data
public class User {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String name;

    @ApiModelProperty(value="")
    private Integer age;

    @ApiModelProperty(value="")
    private String status;
}