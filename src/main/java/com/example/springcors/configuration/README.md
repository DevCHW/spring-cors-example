`WebMvcConfigurer`를 구현한 클래스에서 `addCorsMappings` 메소드를 오버라이드 하여 CORS 설정을 할 수 있습니다.

`addCorsMappings()` 메소드의 매개변수로 들어온 `CorsRegistry registry`의 `addMapping()`의 기본 값은 다음과 같습니다.

```agsl
Allow all origins
Allow "simple" methods GET, HEAD and POST
Allow all headers
Set max age to 1800 seconds (30 minutes)
```

```java
registry.addMapping("/**")
        .allowedOrigins("http://localhost:8080")
        .allowedMethods("GET", "POST")
        .maxAge(3000);
```
위 설정을 설명하자면
Origin은 http://localhost:8080
허용할 메소드는 GET, POST
최대 캐싱 시간은 3000초
로 설정한 것입니다.

위와 같은 코드들을 @Configuration으로 스프링에 등록하면
어플리케이션의 전체 글로벌 설정으로 CORS를 적용한 것입니다.