package com.test;
/**
 * 用来测试resultMap是否成功
 */

import com.domain.teacher;
import com.mapper.resultMap;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class resultMapTest {
    private SqlSessionFactory sqlSessionFactory;
    public void SetUp() throws Exception{
        String resource = "com/mapper/sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    public void doItResultMap() throws Exception{
        SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        resultMap resultMap = sqlSession.getMapper(com.mapper.resultMap.class);
        teacher teacher = resultMap.queryForResultMap();
        System.out.println(teacher.getIda() +"\n" +teacher.getNamea() + "\n" +teacher.getPassworda() );

    }
}
