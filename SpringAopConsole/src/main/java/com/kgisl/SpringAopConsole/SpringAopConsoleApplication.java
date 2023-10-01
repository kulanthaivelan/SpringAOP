package com.kgisl.SpringAopConsole;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@EnableAspectJAutoProxy(proxyTargetClass=true)  
@SpringBootApplication
public class SpringAopConsoleApplication {
   
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAopConsoleApplication.class, args);
	}

}
