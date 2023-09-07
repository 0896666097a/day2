package org.example.beansLifeCycle;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;


public class beansLifeCycle {
    public void init1(){
        System.out.printf("ahihi");
    }

    public void destroy(){

        System.out.printf("se bi dong");
    }
}
