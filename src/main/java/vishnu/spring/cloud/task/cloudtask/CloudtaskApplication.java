package vishnu.spring.cloud.task.cloudtask;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableTask
@ComponentScan(basePackages = {"vishnu.*"})
public class CloudtaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudtaskApplication.class, args);
	}


}
