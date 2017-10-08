package top.haostore.SpringbootForMaven.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import top.haostore.SpringbootForMaven.domain.User;

@Controller
public class HelloController {

	@RequestMapping(value="/msg")
	public String getMsg(){
		//int i = 1/0;
		return "hello world!";
	}
	
	@RequestMapping(value="/freemarker")
	public String getFreemarker(Map<String, Object> map){
		
		map.put("user", new User(1,"dengbh",new Date()));
		
		return "hello";
	}
}
