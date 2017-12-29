package com.sooncode.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sooncode.entity.RuleType;
import com.sooncode.soonjdbc.service.JdbcService;

@RestController
@RequestMapping("rule")
public class RuleTypeController {
	@Autowired
	private JdbcService jdbcService; 
	
	private static Logger logger = LoggerFactory.getLogger(RuleTypeController.class);
	 
	@RequestMapping(value = "hi" ,method=RequestMethod.POST)
	public Map<String,Object> hi(@RequestBody RuleType rt){
		 
		 
		Map<String,Object> map = new HashMap<>();
		Long n = jdbcService.save(rt) ;
		map.put("save", n);
		logger.debug("--------------------------------" );
		return map;
		 
	}
}
