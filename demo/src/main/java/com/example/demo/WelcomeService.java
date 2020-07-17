package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("sit")
public class WelcomeService implements ApplicationRunner{
	
	@Value("${application.message}")
	private String welcomemsg;
	
	@Value("${server.ports}")
	private List<String> lst;
	
	public List<String> getServers() {
		return this.lst;
	}
	public String getWelcomeMsg() {
		
		return welcomemsg;
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		lst.forEach(server -> System.out.println(server));
		
	}
	

}
