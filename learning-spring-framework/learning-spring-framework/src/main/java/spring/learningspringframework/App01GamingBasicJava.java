package spring.learningspringframework;

import spring.learningspringframework.game.GameRunner;
import spring.learningspringframework.game.MarioGame;
import spring.learningspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// 강한 결합(Tightly Coupled)
		// var margioGame = new MarioGame();
//		var game = new MarioGame();
		var game = new SuperContraGame(); // 1: Object Creation 
//		var superContraGame = new SuperContraGame();
//		var gameRunner = new GameRunner(superContraGmae);
		var gameRunner = new GameRunner(game);
		// 2: Object Creation + Wiring Of Dependencies
		// Game is a Dependency of GameRunner
		gameRunner.run();
	}

}
