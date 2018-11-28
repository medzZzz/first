package lessons;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherConfiguration {
    @Bean
    BeanWithDependency beanWithDependency() {
        return new BeanWithDependency();
    }
}