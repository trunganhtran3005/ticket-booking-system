package com.zzzz.domain.service.imp;

import com.zzzz.domain.repository.HelloDomainRepository;
import com.zzzz.domain.service.HelloDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloDomainServiceImp implements HelloDomainService {

    @Autowired
    private HelloDomainRepository helloDomainRepository;

    @Override
    public String hello(String request) {
        return helloDomainRepository.hello(request);
    }
}
