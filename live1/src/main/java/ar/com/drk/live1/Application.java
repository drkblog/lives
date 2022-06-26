package ar.com.drk.live1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("ar.com.drk.live1.persistence")
@EntityScan("ar.com.drk.live1.model")
@SpringBootApplication
public class Application {
  public static void main(final String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
