package com.aws.lambda.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class FactorialService {

    public BigInteger getFactorial(Long num) {
        BigInteger fact = new BigInteger("1");

        for (Long i = 1l; i <= num; i++) {

            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
