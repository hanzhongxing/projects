package com.test.project.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.orm.hibernate3.HibernateTemplate;
import java.io.IOException;
import java.util.Properties;
import static com.test.project.common.DBConstants.*;
import static com.test.project.common.DBConstants.DB_DIALECT;
import static com.test.project.common.DBConstants.DB_DRIVER_CLASS;

/**
 * Created by hanzhongxing on 2018/4/9.
 */
public class HibernateSessionFactory {
    private final static Logger logger= LoggerFactory.getLogger(HibernateSessionFactory.class);
    private HibernateSessionFactory(){}
    public static HibernateTemplate getHibernateTemplate(){
        HibernateTemplate hibernateTemplate = new HibernateTemplate();
        Configuration conf = new Configuration();
        Properties properties = getProperties("mysql.properties");
        conf.setProperties(properties);
        SessionFactory sf = conf.buildSessionFactory();
        hibernateTemplate.setSessionFactory(sf);
        return hibernateTemplate;
    }
    private static Properties getProperties(String proper){
        Properties properties = new Properties();
        try {
            Properties pro =PropertiesLoaderUtils.loadAllProperties(proper,Thread.currentThread().getContextClassLoader());
            if(pro.size()>0) {
                properties.setProperty("hibernate.connection.url", pro.getProperty(DB_URL));
                properties.setProperty("hibernate.connection.username", pro.getProperty(DB_USER_NAME));
                properties.setProperty("hibernate.connection.password", pro.getProperty(DB_USER_PASSWORD));
                properties.setProperty("hibernate.connection.pool.size", pro.getProperty(DB_POOL_SIZE));
            }else{
                properties.setProperty("hibernate.connection.url", "jdbc:mysql://ishare.db.58dns.org:3306/db58_ishare");
                properties.setProperty("hibernate.connection.username","ishare_read");
                properties.setProperty("hibernate.connection.password", "");
                properties.setProperty("hibernate.connection.pool.size","100");
            }
            properties.setProperty("hibernate.connection.driver_class", DB_DRIVER_CLASS);
            properties.setProperty("hibernate.dialect", DB_DIALECT);
        }catch(IOException e){
            logger.error("HibernateSessionFactory getHibernateTemplate "+e.getMessage());
        }
        return properties;
    }
}
