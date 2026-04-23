package com.zzzz.Controller.Resource;

import com.zzzz.application.service.event.EventAppService;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private EventAppService eventAppService;

    @GetMapping
    @RateLimiter(name = "backendA")
    public String hello() {
        return eventAppService.hello();
    }
}
