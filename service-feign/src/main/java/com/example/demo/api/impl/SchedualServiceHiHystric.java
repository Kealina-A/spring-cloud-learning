package com.example.demo.api.impl;

import com.example.demo.api.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author guoyanling
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
