package my.foxbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FoxBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoxBotApplication.class, args);
    }

}
