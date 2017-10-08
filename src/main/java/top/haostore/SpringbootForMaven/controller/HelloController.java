package top.haostore.SpringbootForMaven.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value="/msg")
	public String getMsg(){
		
		return "hello world!";
	}
}
