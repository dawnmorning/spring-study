package spring.learningspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
	public Address address() {
		return new Address("bakjae", "Seoul");
	}

	// 안 됨
//	@Bean
//	public Address Hi() {
//		return new Address("roro", "piana");
//	}
}
