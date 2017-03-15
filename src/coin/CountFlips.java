package coin;

import java.util.Scanner;

public class CountFlips {
	// -----------------------------------------------------------------
	// Flips a coin multiple times and counts the number of heads
	// and tails that result.
	//		Output:
	//			The number flips: 1000
	//			The number of heads: 493
	//			The number of tails: 507
	// -----------------------------------------------------------------
	public static void counter(int trials){
		int headscounter=0;
		int tailscounter=0;
		Coin coin= new Coin();
		System.out.println("You flipped the coin "+trials+" times.");
		while (trials>0){
			if (coin.isHeads()){
			headscounter++;
			} else {
				tailscounter++;
			}
		coin.flip();
			trials --;
		}
		System.out.println("You got "+ headscounter +" heads.");
		System.out.println("You got "+ tailscounter+" tails.");
	}
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		System.out.println("How many times would you like to flip the coin?");
		int num= keyboard.nextInt();
		counter(num);
	}
}
