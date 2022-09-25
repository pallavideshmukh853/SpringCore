package com.springcore.springcoreass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springcoreass/applicationcontext.xml");
		Employee e=(Employee)context.getBean("Employee");
		System.out.println(e);
	}

}
