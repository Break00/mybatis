package com.jason.lee;

import com.jason.lee.entity.Product;
import com.jason.lee.mapper.BrandMapper;
import com.jason.lee.mapper.ProductMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class BrandTest {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";  // 数据源信息
        InputStream in = Resources.getResourceAsStream(resource);
        // 根据全局配置文件创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        // 代表和数据库的一次会话，用完关闭
        // 非线程安全
        SqlSession sqlSession = sqlSessionFactory.openSession();

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        brandMapper.getBrandById(1);
        brandMapper.getBrandByIdPlus(2);
        brandMapper.getBrandStep(3);

    }
}
