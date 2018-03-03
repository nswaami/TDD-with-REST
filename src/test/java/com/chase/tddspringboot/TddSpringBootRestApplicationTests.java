package com.chase.tddspringboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TddSpringBootRestApplicationTests {


    @RunWith(SpringRunner.class)
    @SpringBootTest
    public class TddSpringBootApplicationTests {

        @Test
        public void contextLoads() {
        }

        @Test
        public void testReturnTypeForAmountlessThan100() {
            get("/paymentMethod/47").then().assertThat().body("message", equalTo("Wallet"));
        }

        @Test
        public void testThatForAmountBetween100And1000() {
            get("/paymentMethod/555").then().assertThat().body("message", equalTo("CreditCard"));
        }

        @Test
        public void testReturnTypeForAmountBetween1kAnd10k() {
            get("/paymentMethod/4567").then().assertThat().body("message", equalTo("NetBanking"));
        }

        @Test
        public void testReturnTypeForAmountBetween5kAnd500k() {
            get("/paymentMethod/5766").then().assertThat().body("message", isOneOf("UPI", "NetBanking"));
        }

        @Test
        public void testReturnTypeForAmountBetween10kAnd500k() {
            get("/paymentMethod/104320").then().assertThat().body("message", equalTo("UPI"));
        }

        @Test
        public void testReturnTypeForAmountAbove500k() {
            get("/paymentMethod/576400").then().assertThat().body("message", equalTo("RTGS"));

        }
    }

}
