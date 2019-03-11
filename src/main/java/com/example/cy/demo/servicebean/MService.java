package com.example.cy.demo.servicebean;

import org.springframework.stereotype.Service;

@Service
public class MService{
    public String sayHello(String s){
        return "Hello " + s + " !";
    }
}