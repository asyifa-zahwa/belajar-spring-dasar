package programer_zaman_now.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import programer_zaman_now.spring.core.Data.Foo;

public class ScopeTest {
    private ApplicationContext applicationContext;
    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }
    @Test
    void testScope(){
        Foo foo = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean(Foo.class);
        Foo foo3 = applicationContext.getBean(Foo.class);
        Assertions.assertNotSame(foo2, foo3);
        
    }
    
}
