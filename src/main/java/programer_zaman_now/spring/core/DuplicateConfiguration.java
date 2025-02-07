package programer_zaman_now.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import programer_zaman_now.spring.core.Data.Foo;

@Configuration
public class DuplicateConfiguration {
    @Bean
    public Foo foo1(){
        return new Foo();
    }
    @Bean
    public Foo foo2(){
        return new Foo();
    }
}
