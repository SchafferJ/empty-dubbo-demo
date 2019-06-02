package com.example.dubbo.consumer.demo;

import com.example.dubbo.consumer.demo.service.PrintSeriveConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"spring/consumer.xml"})
public class DubboConsumerDemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DubboConsumerDemoApplication.class, args);
        PrintSeriveConsumer printSeriveConsumer = applicationContext.getBean(PrintSeriveConsumer.class);
        printSeriveConsumer.consumerExec();
    }

}
