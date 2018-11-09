package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import com.netflix.ribbon.proxy.annotation.Hystrix;

@SpringCloudApplication
@EnableFeignClients
@Hystrix
public class HystrixRunApp {

	public static void main(String[] args) {
		SpringApplication.run(HystrixRunApp.class, args);
	}
}
