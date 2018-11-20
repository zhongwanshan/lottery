package lottery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan("lottery.*")
@EnableAsync
public class Apimain extends SpringBootServletInitializer {

    public static  void main(String[] args){
        SpringApplication.run(Apimain.class, args);
    }
}
