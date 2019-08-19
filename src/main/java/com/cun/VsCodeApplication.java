package com.cun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 验证码图片
 * @author lixing
 * http://localhost/toIndex
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableAutoConfiguration
public class VsCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(VsCodeApplication.class, args);
	}
}
