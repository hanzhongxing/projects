package com.test.project.dao;

import com.test.project.exception.DaoException;

/**
 * Created by hanzhongxing on 2018/4/9.
 */
public interface Dao {
    public Long save(Object t) throws DaoException;
    public void delete(Long id) throws DaoException;



}
