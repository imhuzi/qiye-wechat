package chat.qiye.wechat.example.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date : 2021/9/13
 */
@SpringBootApplication
@Slf4j
public class ExampleApp {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ExampleApp.class);
        application.run(args);
        log.info("ExampleApp Service provider started!!!");
    }
}
