package com.example.demo.ex;


import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;



import lombok.extern.slf4j.Slf4j;
@Service
public class Rest_service
{

public String addition(int a, int b)
{
	int add=a+b;
	return (a+b+"addition :"+add);
	
}
public String subtraction(int a, int b)
{
	int sub=a-b;
	
	return (a+ " - " +b+  " subtraction :"+sub);
}

public String multiply(Test t)
{
	
	int a=t.getA();
	int b=t.getB();
	int mul=a*b;
	return (a+ " * " +b+  " multiplication :"+mul);
}
public String division(Test t)
{
	
	try
	{
	int a=t.getA();
	int b=t.getB();
	int div=a/b;
	return(a+ " / " +b+  " division :"+div);
}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return null;

}
}



