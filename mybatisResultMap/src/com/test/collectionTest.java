package com.test;

import com.domain.teacher;
import com.mapper.collection;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class collectionTest {
    private SqlSessionFactory sqlSessionFactory;
    public void SetUp() throws Exception{
        String resource = "com/mapper/sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public void doItCollection() throws Exception{
        SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        collection collection = sqlSession.getMapper(com.mapper.collection.class);
        teacher teacher = collection.queryCollectionTest();
        if(teacher != null ){
            System.out.println(teacher.getList().get(0).getId() + "   " + teacher.getNamea() );
        }else{
            System.out.println("没有查到");
        }


    }
}
