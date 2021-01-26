package com.jason.lee.discriminator.mapper;
import org.apache.ibatis.annotations.Param;

import com.jason.lee.discriminator.Student;

/**
* @author huanli9
* @description
* @date 2021/1/26 11:04
*/

public interface StudentMapper {

    Student findStudentById(@Param("id")Integer id);
}