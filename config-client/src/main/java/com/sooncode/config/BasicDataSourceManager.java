package com.sooncode.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasicDataSourceManager {

	@Value("${operation_platform.dbcp.driver}")
	private String driver;

	@Value("${operation_platform.dbcp.url}")
	private String url;

	@Value("${operation_platform.dbcp.username}")
	private String username;

	@Value("${operation_platform.dbcp.password}")
	private String password;

	@Value("${operation_platform.dbcp.maxActive}")
	private Integer maxActive;

	@Value("${operation_platform.dbcp.initialSize}")
	private Integer initialSize;

	@Value("${operation_platform.dbcp.maxWait}")
	private Integer maxWait;

	@Value("${operation_platform.dbcp.maxIdle}")
	private Integer maxIdle;

	@Value("${operation_platform.dbcp.minIdle}")
	private Integer minIdle;

	@Value("${operation_platform.dbcp.timeBetweenEvictionRunsMillis}")
	private Integer timeBetweenEvictionRunsMillis;

	@Value("${operation_platform.dbcp.minEvictableIdleTimeMillis}")
	private Integer minEvictableIdleTimeMillis;

	@Value("${operation_platform.dbcp.removeAbandoned}")
	private Boolean removeAbandoned;

	@Value("${operation_platform.dbcp.removeAbandonedTimeout}")
	private Integer removeAbandonedTimeout;

	@Value("${operation_platform.dbcp.testWhileIdle}")
	private Boolean testWhileIdle;

	@Value("${operation_platform.dbcp.testOnBorrow}")
	private Boolean testOnBorrow;

	@Value("${operation_platform.dbcp.testOnReturn}")
	private Boolean testOnReturn;

	@Value("${operation_platform.dbcp.validationQuery}")
	private String validationQuery;

	@Bean("dataSource")
	public DataSource getDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		ds.setMaxActive(maxActive);
		ds.setInitialSize(initialSize);
		ds.setMaxWait(maxWait);
		ds.setMaxIdle(maxIdle);
		ds.setMinIdle(minIdle);
		ds.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
		ds.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		ds.setRemoveAbandoned(removeAbandoned);
		ds.setRemoveAbandonedTimeout(removeAbandonedTimeout);
		ds.setTestWhileIdle(testWhileIdle);
		ds.setTestOnBorrow(testOnBorrow);
		ds.setTestOnReturn(testOnReturn);
		ds.setValidationQuery(validationQuery);
		return ds;
	}

}
