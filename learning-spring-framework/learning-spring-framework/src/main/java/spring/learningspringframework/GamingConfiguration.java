package spring.learningspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.learningspringframework.game.GameRunner;
import spring.learningspringframework.game.GamingConsole;
import spring.learningspringframework.game.SuperContraGame;

@Configuration // Spring Beans 시작!!
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new SuperContraGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	

}
