package programer_zaman_now.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

import lombok.extern.slf4j.Slf4j;
import programer_zaman_now.spring.core.Data.Bar;
import programer_zaman_now.spring.core.Data.Foo;

@Slf4j
@Configuration
public class DependOnConfiguration {
    @Lazy
    @Bean
    @DependsOn({"bar"})
    public Foo foo(){
        log.info("create new Foo");
        return new Foo();

    }
    @Bean
    public Bar bar(){
        log.info("Create New Bar");
        return new Bar();
    }
}
