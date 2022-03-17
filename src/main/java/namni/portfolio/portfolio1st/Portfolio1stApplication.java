package namni.portfolio.portfolio1st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude ={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class Portfolio1stApplication {

    public static void main(String[] args) {
        SpringApplication.run(Portfolio1stApplication.class, args);
    }

}
