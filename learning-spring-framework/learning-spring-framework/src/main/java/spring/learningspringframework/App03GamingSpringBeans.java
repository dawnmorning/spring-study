package spring.learningspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.learningspringframework.game.GameRunner;
import spring.learningspringframework.game.GamingConsole;
import spring.learningspringframework.game.MarioGame;
import spring.learningspringframework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}		
	}
}
