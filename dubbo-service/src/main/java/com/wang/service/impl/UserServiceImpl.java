package com.wang.service.impl;

import com.wang.service.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service //将这个类提供的方法对外发布，发布到zookeeper中
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        return "hello dubbo";
    }
}
