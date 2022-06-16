package com.atbinwu.spring5.collectiontype;

import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course> {
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

    @Override
    public Course getObject() throws Exception {
       Course course = new Course();
       course.setCname("abc");
       return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
