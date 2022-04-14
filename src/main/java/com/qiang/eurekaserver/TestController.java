package com.qiang.eurekaserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    /**
     * @Value注解的值，springcloud配置中心修改值并不会实时生效
     */
    @Value("${test.value}")
    private String testValue;

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String test() {
        return testValue;
    }
}
