package com.test;

import com.domain.Mybatisforeach;
import com.domain.teacher;
import com.mapper.sqlOutSide;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class sql {

        private SqlSessionFactory sqlSessionFactory;
        public void SetUp() throws Exception{
            String resource = "com/mapper/sqlMapConfig.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);
        }
        public void doIt() throws Exception{
            SetUp();
            SqlSession sqlSession = sqlSessionFactory.openSession();
            sqlOutSide sqlOutSide = sqlSession.getMapper(com.mapper.sqlOutSide.class);
            Mybatisforeach mybatisforeach = sqlOutSide.query();
            System.out.println(mybatisforeach.getId() + "  " +mybatisforeach.getName() + "  " + mybatisforeach.getPassword() );
        }
    }

