package com.test;

import com.domain.Mybatisforeach;
import com.mapper.foreach;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.InputStream;
import java.util.List;

public class foreachTest {
    private SqlSessionFactory sqlSessionFactory;
    public void SetUp() throws Exception{
        String resource = "com/mapper/sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    public void doIt() throws Exception{
        SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        foreach foreach = sqlSession.getMapper(com.mapper.foreach.class);
        int a[] = {1,3,5};
        List<Mybatisforeach> list = foreach.queryForeach(a);
        for(int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i).getId() + "\n" +list.get(i).getName() + "\n"
            + list.get(i).getPassword()+ "\n");
        }
    }

}
