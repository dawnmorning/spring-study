package spring.learningspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1: Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		// 2: Configure the things that we want Spring to manage - @Configuration
		
		// 3: 스프링이 관리하는 Bean을 검색
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean("person3"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean(Address.class));
	}

}