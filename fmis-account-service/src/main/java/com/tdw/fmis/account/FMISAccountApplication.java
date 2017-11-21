/*
 * 文件名 FMISServiceApplication.java
 * 版权 Copyright 2017 团贷网
 * 创建人 谭荣巧
 * 创建时间 2017年11月17日 下午3:01:38 
 */
package com.tdw.fmis.account;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务提供者<br>
 * 
 * @author 谭荣巧
 * @date 2017年11月17日 下午3:01:38
 * @since fmis-service 1.0-SNAPSHOT
 */
@EnableFeignClients
@SpringCloudApplication
public class FMISAccountApplication {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(FMISAccountApplication.class, args);
	}
}
