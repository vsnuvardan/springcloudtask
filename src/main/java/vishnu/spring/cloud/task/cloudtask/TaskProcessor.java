package vishnu.spring.cloud.task.cloudtask;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TaskProcessor implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        if(null!=strings){
            System.out.println("Parameters  : "+strings.length);
        }
    }

}
