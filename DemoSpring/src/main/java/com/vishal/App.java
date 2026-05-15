package com.vishal;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Hello hello = context.getBean(Hello.class);
//        hello.setAge(34);
//        System.out.println(hello.getAge());
        hello.build();
    }
}
