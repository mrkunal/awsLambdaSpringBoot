package com.aws.lambda.controller;

import com.aws.lambda.service.FactorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigInteger;

@Controller
public class AppController {
    private FactorialService factorialService;

    @Autowired
    public FactorialService getFactorialService(FactorialService factorialService) {
        return this.factorialService = factorialService;
    }

    @RequestMapping("/")
    @ResponseBody
    public BigInteger index(@RequestParam("value") Long value) {

        System.out.println("Calculating Factorial of " + value);
        return factorialService.getFactorial(value);
    }
}
