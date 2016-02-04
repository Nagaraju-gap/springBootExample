package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class HelloWorld{

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(HelloWorld.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "Hello to you, world";
    }

    @RequestMapping("/greet")
    public String hello(){
    	User user = new User();
    	user.firstName = "Raju";
    	user.lastName = "Naga";
    return user.toString();
    }
}