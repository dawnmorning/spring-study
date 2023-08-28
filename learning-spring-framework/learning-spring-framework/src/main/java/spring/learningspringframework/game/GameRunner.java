package spring.learningspringframework.game;

public class GameRunner {
	// 강한 결합
	// MarioGame game;
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running game " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
