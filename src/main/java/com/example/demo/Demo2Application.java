package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
//        SpringApplication.run(Demo2Application.class, args);
        Demo demo = new Demo();
        demo.setName("Jackie Chan");
        demo.setTimestamp(1700630359L);

        // In ra giá trị của dateTime
        System.out.println("Formatted DateTime: " + demo.getFormattedDateTime());
    }

}
