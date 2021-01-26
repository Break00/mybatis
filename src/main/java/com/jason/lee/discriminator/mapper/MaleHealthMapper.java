package com.jason.lee.discriminator.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.jason.lee.discriminator.MaleHealth;

/**
* @author huanli9
* @description
* @date 2021/1/26 11:04
*/

public interface MaleHealthMapper {

    List<MaleHealth> findMaleHealthByStudentId(@Param("studentId")Integer studentId);

}