package com.klu.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klu.demo.model.CourseRegistration;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext con =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        CourseRegistration cr =
                (CourseRegistration) con.getBean("courseRegistration");
cr.display();
      
    }
}