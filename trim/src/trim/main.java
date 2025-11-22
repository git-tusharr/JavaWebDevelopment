package trim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	
	public static void main (String args[]) {
		
		String location="/trim/applicationContext.xml";
		
		ApplicationContext context= new ClassPathXmlApplicationContext(location);
		
		
		mobile mobile=(mobile)context.getBean("mob");
		mobile.display();
		
		
		
		
	}

}
