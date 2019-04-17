/*
 * package com.micro.config.env;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
 * org.springframework.boot.context.properties.ConfigurationProperties; import
 * org.springframework.cloud.context.config.annotation.RefreshScope; import
 * org.springframework.stereotype.Component;
 * 
 * 
 * @Component
 * 
 * @RefreshScope
 * 
 * @ConfigurationProperties
 * //@PropertySource("classpath:application.properties") public class
 * EnvironmentConfig {
 * 
 * private static final Logger LOGGER =
 * LoggerFactory.getLogger(EnvironmentConfig.class);
 * 
 * //@Value("${name}") private String name;
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { LOGGER.info("========== Name {}", name);
 * this.name = name; }
 * 
 * 
 * static class server { private int port;
 * 
 * public int getPort() { return port; }
 * 
 * public void setPort(int port) { this.port = port; } }
 * 
 * 
 * 
 * 
 * }
 */