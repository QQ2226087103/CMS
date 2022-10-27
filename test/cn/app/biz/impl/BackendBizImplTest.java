package cn.app.biz.impl;

import cn.app.biz.BackendBiz;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class BackendBizImplTest {

    @Test
    public void dologin() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
        BackendBiz backendBiz = (BackendBiz) applicationContext.getBean("backendBiz");
        System.out.println(backendBiz.dologin("admin", "123456"));
    }
}