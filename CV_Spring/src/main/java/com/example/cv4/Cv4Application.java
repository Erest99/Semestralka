package com.example.cv4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Properties;

@Configuration
@RestController
@SpringBootApplication
public class Cv4Application {

    @Autowired
    private Environment environment;

    private static final Logger log = (Logger) LoggerFactory.getLogger(Cv4Application.class);

    @Autowired
    private JavaTestConfig config;





    public static void main(String[] args) {

     /*   ConfigurableApplicationContext context = SpringApplication.run(Cv4Application.class, args);
        Trida t = context.getBean(Trida.class);
        t.show();
        t.hello();*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        SpringApplication app = new SpringApplication(Cv4Application.class);
        ConfigurableEnvironment environment = context.getEnvironment();
        environment.setActiveProfiles( "Default");
        //ConfigurableApplicationContext context2 = app.run(args);

        LocalDateTime now = LocalDateTime.now();

        log.debug("Dnes je {}", now);
        log.debug("DEBUG");
        log.info("INFO");
        log.warn("WARN");
        log.error("ERROR");
        //context.close();



        context.register(JavaTestConfig.class);

        context.refresh();
        myInterface mI = context.getBean(myInterface.class);
        System.out.println(mI.metoda());
        context.close();





    }

    @RestController
    class GreetingController {

        @RequestMapping("/hello/{name}")
        String hello(@PathVariable String name) {
            return "Hello, " + name + "!";
        }
    }

}
