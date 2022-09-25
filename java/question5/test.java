package question5;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class test {

		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("question5/applicationcontext.xml");
	       SetterMessage sm1 = (SetterMessage)context.getBean("SM");
	       System.out.println(sm1);
		}
	}


