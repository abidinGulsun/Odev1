package Ödev;

public class Main {

	public static void main(String[] args) {

		Game game1 = new Game();

		Game game2 = new Game(2, "The Witcher 3");

		Game game3 = new Game(3, "The Elder Scrolls Skyrim", "");

		Game[] games = { game1, game2, game3 };

		for (Game game : games) {
			System.out.println(game.gameName);
		}
		System.out.println();
		GameCategoryManager gameCategoryManager = new GameCategoryManager();
		gameCategoryManager.addCard(game1);
		gameCategoryManager.addCard(game2);
		gameCategoryManager.addCard(game3);
		gameCategoryManager.added(game1);

		Category category1 = new Category();
		category1.id = 1;
		category1.gameName = "Oyun";
	}

}
