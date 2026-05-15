package com.vishal.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hello {
    @Autowired // Field Injection
    @Qualifier("laptop")
    private Computer computer;
//    public Hello(Laptop laptop){
//        this.laptop = laptop;
//    }
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }


    public void build() {
        computer.compile();
        System.out.println("You are working on awesome project ");
    }
}
