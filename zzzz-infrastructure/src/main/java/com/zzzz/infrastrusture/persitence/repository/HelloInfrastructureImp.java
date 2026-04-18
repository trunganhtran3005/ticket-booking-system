package com.zzzz.infrastrusture.persitence.repository;


import com.zzzz.domain.repository.HelloDomainRepository;
import org.springframework.stereotype.Service;

@Service
public class HelloInfrastructureImp implements HelloDomainRepository {
    @Override
    public String hello(String request) {
        return "hello infrastructure";
    }
}
