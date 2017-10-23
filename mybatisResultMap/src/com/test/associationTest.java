package com.test;

import com.domain.teacher;
import com.mapper.assocation;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class associationTest {
    private SqlSessionFactory sqlSessionFactory;
    public void SetUp() throws Exception{
        String resource = "com/mapper/sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public void doIt() throws  Exception{
        SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        assocation assocation = sqlSession.getMapper(com.mapper.assocation.class);
        teacher teacher = assocation.query();
        System.out.println(teacher.getMybatisforeach().getName()+ "\n" + teacher.getNamea()+"\n"+
        teacher.getIda());
    }
}
