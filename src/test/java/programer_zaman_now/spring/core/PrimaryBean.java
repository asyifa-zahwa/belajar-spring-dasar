package programer_zaman_now.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import programer_zaman_now.spring.core.Data.Foo;

public class PrimaryBean {

    private ApplicationContext applicationContext;
    @BeforeEach
    void setUp(){
        applicationContext  = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);
    }

    @Test
    void primaryTest(){
        Foo foo = applicationContext.getBean(Foo.class);
        Foo foo1 = applicationContext.getBean( "foo1", Foo.class);
        Foo foo2 = applicationContext.getBean( "foo2", Foo.class);
        Assertions.assertSame(foo1, foo);
    }
}
