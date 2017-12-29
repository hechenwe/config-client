package com.sooncode;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations={"classpath:spring-comm-dao.xml"})
public class ConfigClass {
    
}