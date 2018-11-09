package com.example.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.DemoService;

/**
 * Created by libotao on 2018/11/7.
 */
@Service(version="1.0.0")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String s) {
        return "Service provider: Hello, " + s;
    }
}
