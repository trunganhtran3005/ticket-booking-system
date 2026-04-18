package com.zzzz.application.service.event.imp;

import com.zzzz.application.service.event.EventAppService;

import com.zzzz.domain.service.HelloDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventAppServiceImp implements EventAppService {

    @Autowired
    private HelloDomainService helloDomainService;

    @Override
    public String hello() {
        return helloDomainService.hello("hello");
    }
}
