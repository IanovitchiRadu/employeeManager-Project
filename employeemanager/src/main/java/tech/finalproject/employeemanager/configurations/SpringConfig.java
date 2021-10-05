package tech.finalproject.employeemanager.configurations;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("tech.finalproject.employeemanager")
@EntityScan("tech.finalproject.employeemanager.model")
@EnableJpaRepositories("tech.finalproject.employeemanager.repo")
public class SpringConfig {
}
