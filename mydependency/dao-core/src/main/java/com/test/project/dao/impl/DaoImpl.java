package com.test.project.dao.impl;

import com.test.project.dao.Dao;
import com.test.project.dao.HibernateSessionFactory;
import com.test.project.exception.DaoException;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.io.Serializable;

/**
 * Created by hanzhongxing on 2018/4/9.
 */
public class DaoImpl implements Dao{
    private final HibernateTemplate hibernateTemplate= HibernateSessionFactory.getHibernateTemplate();


    @Override
    public Long save(Object t) throws DaoException {
        Serializable serializable= hibernateTemplate.save(t);
        return (Long)serializable;
    }

    @Override
    public void delete(Long id) throws DaoException {
        hibernateTemplate.delete(id);
    }
}
