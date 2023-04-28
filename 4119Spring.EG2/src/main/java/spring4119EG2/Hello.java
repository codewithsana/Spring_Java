package spring4119EG2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {
public static void main(String[] args) {
	ApplicationContext s1=new ClassPathXmlApplicationContext("applicationContext.xml");
	HelloService sc=(HelloService) s1.getBean("name");
	sc.hii();
	
}
}