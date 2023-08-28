package spring.learningspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// jdk 16
// setter getter method를 만들 필요가 없어짐
record Person(String name, int age, Address address) {
};

record Address(String firstLineString, String city) {
};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "dawn";
	}

	@Bean
	public int age() {
		return 29;
	}

	@Bean
	public Person person() {
		return new Person("dawn", 29, new Address("songlidan", "Seoul"));
	}

	
	@Bean
	public Person person2() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3(String name, int age, Address address) {
		return new Person(name(), age(), address());
	}

	@Bean
	public Person person4qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
		return new Person(name, age, address);
	}
	@Bean
	@Primary
	public Address address() {
		return new Address("bakjae", "Seoul");
	}
	
	@Bean
	@Qualifier("address3qualifier")
	public Address address2() {
		return new Address("yesman", "andong");
	}
	// 안 됨
//	@Bean
//	public Address Hi() {
//		return new Address("roro", "piana");
//	}
}
