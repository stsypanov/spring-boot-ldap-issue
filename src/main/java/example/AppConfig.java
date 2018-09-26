package example;

import example.entity.SimpleEntity;
import example.repository.SimpleRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackageClasses = SimpleEntity.class)
@EnableJpaRepositories(basePackageClasses = SimpleRepository.class)
public class AppConfig {

//    @Bean
//    public LdapTemplate ldapTemplate(ContextSource contextSource) {
//        return new LdapTemplate(contextSource);
//    }
}
