package com.example.dubbo.provider.demo;

import com.example.dubbo.provider.demo.service.impl.PrintServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource({"spring/provider.xml"})
public class DubboProviderDemoApplication {


    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(DubboProviderDemoApplication.class, args);
        while (true) {
            Thread.sleep(30_000L);
        }
    }

}
