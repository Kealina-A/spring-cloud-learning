package com.example.demo.api.impl;

import com.example.demo.api.ScheduleServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author guoyanling
 */
@Component
public class ScheduleServiceHiHystric implements ScheduleServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
