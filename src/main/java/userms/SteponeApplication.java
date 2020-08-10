package userms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ZHZ
 */
@SpringBootApplication
@MapperScan("userms.mapper")
public class SteponeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SteponeApplication.class, args);
    }
}
