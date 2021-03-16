# spring-boot-hystrix
__Open source libray orignally created by netflix.__

use to avoid failure of application.
Implement circuit breaker pattern.
Hystrix is a latency and fault tolerance desigined.
Hystrix isolates the points of access between the services, stops cascading failures across them and provides the fallback options.
Hystrix act as fault tolerance and resilience.

### What is fault tolerance ? 
 
Give a application if there is a fault, how much the system has specific fault.


### What is resilience?
 how much fault your system tolarated.
 
 Two features of Hystrix
 
 
      - Fallback method
      - Circuit breaker
##### What is Circuit breaker?
Netflix's Hystrix library provides an implementation of the circuit breaker pattern.
Detect somthing is wrong.
Its basic function is to intrupt current flow after falut is detected.

__Example URLs__
Application | URL 
--- | --- |
ShoppingService | http://localhost:8083/shoppingWitoutHystrix | 
Stop CustomerAccountService | http://localhost:8083/onlineshopping|  
