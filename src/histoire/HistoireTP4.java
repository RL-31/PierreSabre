package histoire;

import personnages.*;

public class HistoireTP4 {

	public static void main(String[] args) {
		
		Ronin roro = new Ronin("Roro", "shochu", 54);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whishy", 45, "Warsong");
		
		roro.provoquer(yaku);
		
	}

}