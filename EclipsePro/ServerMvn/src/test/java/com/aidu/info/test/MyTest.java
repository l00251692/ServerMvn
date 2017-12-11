package com.aidu.info.test;

import javax.annotation.Resource;  

import org.apache.log4j.Logger;  
import org.junit.Before;  
import org.junit.Test;  
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aidu.info.pojo.Seller;
import com.aidu.info.service.SellerService;
import com.alibaba.fastjson.JSON;  
  
  
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class MyTest {  
    private static Logger logger = Logger.getLogger(MyTest.class);  
//  private ApplicationContext ac = null;  
    @Resource
    public SellerService sellerService = null;  
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    @Test  
    public void test1() {  
        //Seller seller = sellerService.getAllSellers();  
    	String seller = sellerService.getAllSellers(); 
        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName());  
        logger.info(JSON.toJSONString(seller));  
    }  
}  

