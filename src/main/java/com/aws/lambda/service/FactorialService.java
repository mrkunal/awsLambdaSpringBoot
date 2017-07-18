package com.aws.lambda.service;

import com.aws.lambda.co.FactorialCO;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class FactorialService {

    public BigInteger getFactorial(FactorialCO factorialCO) {
        System.out.println("UserName :" + factorialCO.getUsername());
        BigInteger fact = new BigInteger("1");

        for (Long i = 1l; i <= factorialCO.getNum(); i++) {

            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
