package programer_zaman_now.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import lombok.extern.slf4j.Slf4j;
import programer_zaman_now.spring.core.Data.Foo;

@Slf4j
@Configuration
public class BeanConfiguration {
    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        log.info("Create Foo");
        return foo;
    } 
}
