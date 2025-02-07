package programer_zaman_now.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;

import programer_zaman_now.spring.core.Data.Foo;

public class DuplicateBean {
    @Test
    void testDuplicate(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, ()->{
            Foo foo = context.getBean(Foo.class);
        });
        //Foo foo = context.getBean( "foo1", Foo.class);

    } 
    //primary test
    @Test
    void getDuplicate(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
        //Foo foo = context.getBean(Foo.class);
        Foo foo1 = context.getBean( "foo1", Foo.class);
        Foo foo2 = context.getBean( "foo2", Foo.class);
        //Assertions.assertSame(foo1, foo);
        Assertions.assertNotSame(foo1, foo2);
    } 

}
