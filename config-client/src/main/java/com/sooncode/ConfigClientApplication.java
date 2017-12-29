package com.sooncode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sooncode.entity.RuleType;
import com.sooncode.soonjdbc.service.JdbcService;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

 	@Autowired
	private JdbcService jdbcService; 
	
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${operation_platform.dbcp.driver}")
	String foo;
	@RequestMapping(value = "/hi")
	public String hi(){
		
		RuleType rt = new RuleType();
		rt.setRuleTypeId("dfjk");
		rt.setRuleTypeCode("Type");
		
		 jdbcService.save(rt) ;
		return foo;
	}
}
