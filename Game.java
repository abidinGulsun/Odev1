package Ödev;

public class Game {

	int gameİd;
	String gameName;
	String detail;
	String company;
	String price;

	public Game() {
		this(1, "Assassins Creed Unity", "Bir suikascı olan arno'nun hayatını yer alan bir oyundur...", "Ubisoft",
				"99.99 Tl");
	}

	public Game(int gameİd, String gameName) {
		this(2, "The Witcher 3", "CD Projekt tarafından yayınlanan bir dizi fantezi aksiyon rol yapma oyunudur.",
				"Cd Projekt", "55.00 TL");
	}

	public Game(int gameİd, String gameName, String detail) {
		this(3, "The Elder Scrolls Skyrim",
				"İlk doğan alduin isimli bir ejderhanın karşısında durabilecek olan tek varlık olan dragonborn'un savaşı...",
				"Bethesda", "55.00 Tl");
	}

	public Game(int gameİd, String gameName, String detail, String company, String price) {
		super();
		this.gameİd = gameİd;
		this.gameName = gameName;
		this.detail = detail;
		this.company = company;
		this.price = price;
	}

}
