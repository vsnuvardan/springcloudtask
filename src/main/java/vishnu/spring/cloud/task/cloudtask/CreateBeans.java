package vishnu.spring.cloud.task.cloudtask;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class CreateBeans {
    @Bean
    public TaskProcessor taskProcessor(){
        return new TaskProcessor();
    }
}
