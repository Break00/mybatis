package com.jason.lee.discriminator.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.jason.lee.discriminator.FemaleHealth;

/**
* @author huanli9
* @description
* @date 2021/1/26 11:04
*/

public interface FemaleHealthMapper {

    List<FemaleHealth> findFemaleHealthByStudentId(@Param("studentId")Integer studentId);

}