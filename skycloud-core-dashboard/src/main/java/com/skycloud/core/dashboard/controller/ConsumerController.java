package com.skycloud.core.dashboard.controller;

import com.skycloud.core.dashboard.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sky
 * @description
 **/
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        computeService.addService3();
        return computeService.addService4();
    }
}
