package com.example.cy.demo.servicebean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseService{
    @Autowired
    MService mService;
    
    public String sayHelloString(String s){
        return mService.sayHello(s);
    }
}