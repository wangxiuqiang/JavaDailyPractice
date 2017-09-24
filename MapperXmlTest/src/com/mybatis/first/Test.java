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
public class Test{
//用原始的方法来做dao 层  ,如果有多个就会重复写下面的代码中的前几行
//    public  void query(int id) throws Exception{
//          String resource = "SqlMapper.xml";
//          InputStream inputStream = Resources.getResourceAsStream(resource);
//          SqlSessionFactory   sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//          SqlSession sqlSession = sqlSessionFactory.openSession();
//          User user = sqlSession.selectOne("test.queryById", 1);
//          System.out.println(user);
//      }

/*
首先定义会话工厂,保证他的实现是工具类使用
 */
    private SqlSessionFactory sqlSessionFactory;
public void SetUp() throws  Exception{
    String resource = "SqlMapper.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
          sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
}
public void test() throws Exception {
            SetUp();
            SqlSession sqlSession = sqlSessionFactory.openSession();
            UserFunction userFunction = sqlSession.getMapper(UserFunction.class);
            User user = userFunction.query(1);
            System.out.println(user);

}
}
