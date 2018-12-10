package com.example.demo.controller;

import com.example.demo.api.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guoyanling
 */
@RestController
public class HiController {

    private ScheduleServiceHi scheduleServiceHi;

    @Autowired
    public HiController(ScheduleServiceHi scheduleServiceHi) {
        this.scheduleServiceHi = scheduleServiceHi;
    }

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return scheduleServiceHi.sayHiFromClientOne(name);
    }
}
