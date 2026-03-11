package com.klu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klu.config.Appconfig;
import com.klu.model.order;

public class MainApp {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    ApplicationContext cn = new AnnotationConfigApplicationContext(Appconfig.class);
    order or = cn.getBean(order.class);
    or.display();
    
    
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    order or1 =(order) context.getBean(order.class);
    or1.display();
  }
  
  

}