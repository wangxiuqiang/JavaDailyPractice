package com.mybatis.Imp;

import com.mybatis.first.User;

/**
 * Created by wxq on 17-9-21.
 */
public interface UserFunction {
    public User query(int id) throws Exception;
}
