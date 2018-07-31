# Spring Boot 

### Mock
가짜 객체로 테스트를 하기 위한 환경 구축이 어렵거나, 특정 경우에 의존적인 경우 실제 객체가 아닌 가짜 객체를 사용한다. 


어떠한 DB를 사용할지 정하지 않았거나, table를 만들지 않았다면 개발자는 손놓고 기다릴 수 밖에 없다. </br>
이럴 때 Mock이 필요하다. </br>

여러가지 프레임워크 중 사용법이 간단한 Mockito를 사용해보자. :) 

### Mockito Dependency

```
<!-- https://mvnrepository.com/artifact/org.mockito/mockito-core -->
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>2.20.1</version>
    <scope>test</scope>
</dependency>
```

### 구조

```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── kakao
│   │   │           └── hotire
│   │   │               ├── MockitoApplication.java
│   │   │               ├── model
│   │   │               │   └── TestUser.java
│   │   │               ├── repository
│   │   │               │   └── TestRepository.java
│   │   │               └── service
│   │   │                   └── TestService.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── static
│   │       └── templates
│   └── test
│       └── java
│           └── com
│               └── kakao
│                   └── hotire
│                       ├── HotireApplicationTests.java
│                       └── service
│                           └── TestServiceTest.java

```

</br> hotire blog : https://blog.naver.com/gngh0101
</br> mockito : https://github.com/mockito/mockito

