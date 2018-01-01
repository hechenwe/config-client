package com.sooncode.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations={"classpath:bean_manager/spring-comm-dao.xml","classpath:bean_manager/parameter_verification.xml"})
public class ConfigClass {
    
}