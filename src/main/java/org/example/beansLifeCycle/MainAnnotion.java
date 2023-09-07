package org.example.beansLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotion {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationbaseconfiguration/beans.xml");
        applicationContext.close();
    }
}
