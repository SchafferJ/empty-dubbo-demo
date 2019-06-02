package com.example.dubbo.provider.demo.service.impl;

import com.example.dubbo.provider.demo.service.PrintService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class PrintServiceImpl implements PrintService {
    @Override
    public String print(String value) {
        System.out.println("here is Provider :" + value);
        return LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
    }
}
