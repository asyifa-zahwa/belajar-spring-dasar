package programer_zaman_now.spring.core;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import lombok.extern.slf4j.Slf4j;
import programer_zaman_now.spring.core.Data.Foo;

@Slf4j
@Configuration
public class ScopeConfiguration {
    @Scope("prototype")
    @Bean
    public Foo foo(){
        log.info("create new Foo");
        return new Foo();
    }
}
