package top.haostore.SpringbootForMaven.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalException {

	@ResponseBody
	@ExceptionHandler(value=Exception.class)
	public String globalExceptionHandler(HttpServletRequest req, Exception e){
		
		return "服务器打了个盹.....";
	}
}
