/*
 * 文件名 FMISGatewayApplication.java
 * 版权 Copyright 2017 团贷网
 * 创建人 谭荣巧
 * 创建时间 2017年11月17日 下午3:17:16 
 */
package com.tdw.fmis.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 服务网关<br>
 * 
 * @author 谭荣巧
 * @date 2017年11月17日 下午3:17:16
 * @since fmis-gateway 1.0-SNAPSHOT
 */
@EnableZuulProxy
@SpringCloudApplication
public class FMISGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FMISGatewayApplication.class, args);
	}
	
//	/**
//	 * 启动过滤器<br>
//	 * 
//	 * @author 谭荣巧   
//	 * @date 2017年11月17日 下午3:58:46
//	 * @return
//	 * @since fmis-gateway 1.0-SNAPSHOT
//	 */
//	@Bean
//	public AccessFilter accessFilter() {
//		return new AccessFilter();
//	}
}
