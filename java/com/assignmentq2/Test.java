package com.assignmentq2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


	public class Test {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			ApplicationContext context=new ClassPathXmlApplicationContext("com/assignmentq2/applicationcontext.xml");
			PrintMessage e=(PrintMessage)context.getBean("PrintMessage");
			System.out.println(e);
		}

	}


