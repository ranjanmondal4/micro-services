package com.micro.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.micro.config.env.EnvironmentConfig;

@RefreshScope
@RestController
//@PropertySource("classpath:application.properties")
public class AdminController {

	/*
	 * @Autowired private EnvironmentConfig env;
	 * 
	 * 
	 * @GetMapping(value = "/configuration") public ResponseEntity<Object>
	 * permissions(HttpServletResponse resp) {
	 * 
	 * Map<String, Object> result = new HashMap<>(); result.put("message",
	 * env.getName()); return new ResponseEntity<>(result, HttpStatus.OK);
	 * 
	 * }
	 */
}
