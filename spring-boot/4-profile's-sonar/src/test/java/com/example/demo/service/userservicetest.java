package com.example.demo.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class userservicetest {

    @Disabled
    @Test //test a pieces of code or function
    public void testadd(){
        assertEquals(4, 1+3);
    }

    @Disabled
    @ParameterizedTest // runs same test with multiple values
    @CsvSource({
            "1,1,2",
            "3,6,9",
            "3,4,7"
    })
    public void testpara(int a, int b, int expected){
        assertEquals(expected, a + b);
    }

}
