package practice.hspringbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class HSpringbootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HSpringbootWebApplication.class, args);
	}

}
