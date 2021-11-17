package com.example.demo.ex;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController
public class FirstController
{
	private static final Logger log = LoggerFactory.getLogger(FirstController.class);

	@Autowired
	Rest_service rs;
	
@GetMapping("/add/{a}/{b}")
public String addition(@PathVariable int a,@PathVariable int b)
{
	log.info("this is welcome message");
	return rs.addition(a,b);
	
}
@GetMapping("/sub")
public String subtraction(@RequestParam int a,@RequestParam int b)
{
	log.info("this is welcome message");
	return rs.subtraction(a,b);
	
}
@PostMapping("/multiply")
public String mul(@RequestBody Test t)
{
	return rs.multiply(t);
}
@PostMapping("/division")
public String div(@RequestBody Test t)
{
	return rs.division(t);
}
	
}
