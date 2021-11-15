package arquitectura.software.mscostumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients

public class MsCostumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCostumerApplication.class, args);
	}

}
