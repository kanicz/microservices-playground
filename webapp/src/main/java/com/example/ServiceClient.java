package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service")
@FeignClient(name = "${feign.name}", url = "${feign.url}")
public interface ServiceClient {
    @RequestMapping(method = RequestMethod.GET, value = "/welcome")
    String getWelcomeMessage();
}
