package com.genspark.zuulgatewayproxy;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayBreakerController {

    @RequestMapping(value="/errorbreaker",method = RequestMethod.GET)
    public String getErrorBreakerMessage(){
        return "You have hit Error breaker";
    }
    @RequestMapping(value="/timebreaker",method = RequestMethod.GET)
    public String getTimeBreakerMessage(){
        return "You have hit Time breaker";
    }
}
