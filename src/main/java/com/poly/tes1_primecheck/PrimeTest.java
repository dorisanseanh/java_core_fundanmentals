package com.poly.tes1_primecheck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.poly.tes1_primecheck.PrimeCheck.isPrime;

public class PrimeTest {
    private static final Logger logger = LoggerFactory.getLogger(PrimeTest.class);

    public static void main(String[] args) {
        int n = 5;
        if (isPrime(n)) {
            logger.info("The result is: {}", n);
        } else {
            logger.info("{} is not a prime number.", n);
        }
    }
}
