package com.skycloud.core.dashboard.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * @author sky
 * @description
 **/
@Service
public class ComputeService {


    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService3() {
        int randomInt= (int)(Math.random() * 10);
        if(randomInt<8){  //模拟调用失败情况
            throw new RuntimeException("call dependency service fail.");
        }else{
            return "number:"+randomInt;
        }
    }

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService4() {
        int randomInt= (int)(Math.random() * 10);
        if(randomInt<6){  //模拟调用失败情况
            throw new RuntimeException("call dependency service fail.");
        }else{
            return "number:"+randomInt;
        }
    }

    public String addServiceFallback() {
        return "error";
    }
}
