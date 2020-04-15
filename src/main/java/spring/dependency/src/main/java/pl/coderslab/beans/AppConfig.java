package spring.dependency.src.main.java.pl.coderslab.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public HelloWorld2 helloWorld2() {
        return new HelloWorld2();
    }

    @Bean
    public Captain jackSparrow() {
        return new Captain();
    }

    @Bean
    public Ship blackPearl() {
        return new Ship(jackSparrow());
    }

    @Bean
    @Scope("prototype")
    public ScopePrototype scopePrototype() {
        return new ScopePrototype();
    }

    @Bean
    public ScopeSingleton scopeSingleton() {
        return new ScopeSingleton();
    }
}
