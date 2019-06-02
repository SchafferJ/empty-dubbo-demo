package com.example.dubbo.consumer.demo.service;

import com.example.dubbo.provider.demo.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PrintSeriveConsumer {
    @Autowired
    private PrintService printService;

    public void consumerExec() {
        String s = printService.print(LocalDateTime.now().toString());
        System.out.println(s);
    }
}
