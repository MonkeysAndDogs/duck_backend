package zoo.duck.dangergoods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DangerGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DangerGoodsApplication.class, args);
    }
}
