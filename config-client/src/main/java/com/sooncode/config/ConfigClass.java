package com.sooncode.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations={"classpath:db_config/spring-comm-dao.xml"})
public class ConfigClass {
    
}