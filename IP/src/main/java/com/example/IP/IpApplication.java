package com.example.IP;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
/*
 * @AutoConfigurationPackage 给容器中导入组件导入的组件由AutoConfigurationPackages 将主配置类的所在包及下面所有子包的所有组件扫描到Spring组件
 */
public class IpApplication {
	public static void main(String[] args) {
		SpringApplication.run(IpApplication.class, args);
	}
}
