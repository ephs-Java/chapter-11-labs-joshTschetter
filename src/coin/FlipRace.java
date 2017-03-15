package coin;

public class FlipRace {
	// -----------------------------------------------------------------
	// Flips two coins until one of them comes up heads three times in a row.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		Coin coinone= new Coin();
		Coin cointwo= new Coin();
		PrintRace(coinone, cointwo);
			// Create two separate coin objects
	
			// Print the flip results (uses Coin's toString method)
		
			//stop the flipping once one of the coins gets to heads, 3 times in a row
	}
	
	public static void PrintRace(Coin one, Coin two){
		int countera= 0;
		int counterb=0;
	while ((countera < 3)&&(counterb<3)){
		if (one.isHeads()){
			countera ++;
		} else {
			countera=0;
		}
		if (two.isHeads()){
			counterb ++;
		} else {
			counterb=0;
		}
		System.out.println("Coin a: "+one.toString());
		System.out.println("Coin b: "+two.toString());
		one.flip();
		two.flip();
	}
	}
}