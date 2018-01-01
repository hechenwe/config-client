package com.sooncode;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication  
@ServletComponentScan
@EnableAutoConfiguration 
public class Application extends SpringBootServletInitializer{  
  
    public static void main(String[] args) throws IOException {  
        // 程序启动入口  
      Properties properties = new Properties();  
      InputStream in = Application.class.getClassLoader().getResourceAsStream("bootstrap.properties");  
      properties.load(in);  
      SpringApplication app = new SpringApplication(Application.class);  
      app.setDefaultProperties(properties);  
      app.run(args);  
      
        
    }  
  
    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {  
        
        builder.sources(this.getClass());  
        return super.configure(builder);  
  
      
    }  
    
}