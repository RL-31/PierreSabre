package histoire;

import personnages.*;

public class HistoireTP4 {

	public static void main(String[] args) {
		
		Commercant marco = new Commercant("Marco", 15);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
		
	}

}