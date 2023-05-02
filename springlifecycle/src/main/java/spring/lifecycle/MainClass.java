package spring.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String... args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(appConfig.class);
		Employee e1 = context.getBean(Employee.class);
		e1.knowInfor();
		context.close();
		}

}
