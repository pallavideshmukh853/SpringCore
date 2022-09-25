package question4;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class test {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("question4/applicationcontext.xml");
		ConstructorMessage CMC = (ConstructorMessage)context.getBean("CM");
		System.out.println(CMC);
	}
	}


