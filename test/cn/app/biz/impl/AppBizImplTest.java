package cn.app.biz.impl;

import cn.app.biz.AppBiz;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class AppBizImplTest {

    @Test
    public void getAllApp() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
        AppBiz appBiz = (AppBiz) applicationContext.getBean("appBiz");
        System.out.println(appBiz.getAllApp());
    }
}