package programer_zaman_now.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import programer_zaman_now.spring.core.Data.Foo;

public class DependOnTest {
    private ApplicationContext applicationContext;
    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(DependOnConfiguration.class);
    }
    @Test
    void testDependOn(){
        Foo foo = applicationContext.getBean(Foo.class);
    }

}
