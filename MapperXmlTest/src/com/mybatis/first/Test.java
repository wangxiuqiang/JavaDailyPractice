package com.mybatis.first;

import com.mybatis.Imp.UserFunction;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by wxq on 17-9-21.
 */
public class Test implements UserFunction{

    public  void query(int id) throws Exception{
          String resource = "SqlMapper.xml";
          InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory   sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
          SqlSession sqlSession = sqlSessionFactory.openSession();
          User user = sqlSession.selectOne("test.queryById", 1);
          System.out.println(user);
      }


}
