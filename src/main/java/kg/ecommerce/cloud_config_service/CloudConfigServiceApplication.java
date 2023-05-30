package kg.ecommerce.cloud_config_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(CloudConfigServiceApplication.class, args);
  }

}
