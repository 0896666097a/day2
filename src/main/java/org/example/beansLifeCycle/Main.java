package org.example.beansLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beansLifeCycle/beans.xml");
        applicationContext.close();
    }
}
