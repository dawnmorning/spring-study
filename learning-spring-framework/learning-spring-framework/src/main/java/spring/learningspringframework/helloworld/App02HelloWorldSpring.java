package spring.learningspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1: Launch a Spring Context
		try(var context = 
				new AnnotationConfigApplicationContext
				(HelloWorldConfiguration.class)){
			// 2: Configure the things that we want Spring to manage - @Configuration
			
			// 3: 스프링이 관리하는 Bean을 검색
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2"));
			System.out.println(context.getBean("person3"));
			System.out.println(context.getBean("address"));
			// Primary 어노테이션으로 우선순위 해결 가능
			System.out.println(context.getBean(Address.class));
			// Qualifier 어노테이션으로 한정자 사용
			System.out.println(context.getBean("person4qualifier"));
			
			// 전체 constuctor
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}
		
		
		
	}

}
