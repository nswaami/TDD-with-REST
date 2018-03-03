# TDD-with-REST
Problem statement - write a REST service to return a payment method based on transaction to pay
For transaction amount 1 - 100 - Use Wallet
For transaction amount 100 - 100 - Use Credit Card
For transaction amount 1000 - 10000 - Use Net Banking
For transaction amount 5000 - 500000 - Use UPI
For transaction amount greater than 500000, use RTGS

Transaction properties - amount, account from, account to, (assume/hardcode these for now)

1st approach - Write a simple application that uses spring boot to get a bean and return a value
2nd approach - REST-ify it, use Spring Boot to send a HTTP GET request and get a HTTP Response with appropriate response code

Note: Difference between 1st approach and 2nd approach
Appreciate how jayway, rest assured makes things easy to test REST services.



Reference Links for this work:
Spring Initializr http://start.spring.io/
https://hackernoon.com/spring-boot-rest-tdd-from-scratch-15f13ed799e0
http://www.springboottutorial.com/creating-rest-service-with-spring-boot
http://hamcrest.org/JavaHamcrest/javadoc/1.3/org/hamcrest/Matchers.html

https://github.com/rest-assured/rest-assured/wiki/Usage
