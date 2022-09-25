package com.question3;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	public class DrawShape {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			ApplicationContext context=new ClassPathXmlApplicationContext("com/question3/applicationcontext.xml");
			Rectangle e=(Rectangle)context.getBean("Rectangle");
			System.out.println(e);
		}

	}

