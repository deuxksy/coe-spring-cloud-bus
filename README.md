# Spring Cloud Config Bus
> AMQP 브로커를 이용한 Spring Cloud Bus 브로드캐스트 샘플 프로젝트

* Spring Cloud Config Server를 구축하게 되면 각 어플리케이션에 대한 설정정보(ex: applicatoin.yml)를 한 곳에서 관리 할 수 있습니다.

* 하지만 해당 정보가 수정 될 경우 클라이언트 어플리케이션을 재기동해야 하는 것은 변함이 없습니다.

* 이러한 방식은 이상적이지 않기 때문에 spring-boot-actuator와 @RefreshScope 어노테이션을 추가한 이후에 해당 클라이언트에 아래와 같은 명령을 보내어 재기동 없이 설정정보를 다시 읽어오게 할 수 있습니다.

    ~~~bash
    $ curl -x POST http://[ip]:[port]/refresh
    ~~~

* 하지만 클라우드 환경에서는 모든 actuator endpoint에 접근하여 모든 클라이언트 어플리케이션을 refresh 해야 하는 번거로움이 존재합니다. 이러한 문제는 Spring Cloud Bus를 통해서 해결 할 수 있습니다.

## Getting started

- System Requirements

    1. hello act client

        | Type      	| Tool         	| Version      	|
        |-----------	|--------------	|--------------	|
        | Compiler  	| JDK         	| 1.8 이상     	|
        | Builder   	| maven        	| 3.2 이상     	|
        | Framework 	| Spring Boot  	| 2.0.3        	|
        |           	| Spring Cloud 	| Finchley.RELEASE 	|

    2. config-server

        | Type      	| Tool         	| Version      	|
        |-----------	|--------------	|--------------	|
        | Compiler  	| JDK         	| 1.8 이상     	|
        | Builder   	| maven        	| 3.2 이상     	|
        | Framework 	| Spring Boot  	| 2.0.2        	|
        |           	| Spring Cloud 	| Finchley.RELEASE 	|

## Related Links

- [MSA CoE Guide](https://coe.gitbook.io/guide/config/springcloudconfigbus)

- [Official site](https://www.baeldung.com/spring-cloud-bus)