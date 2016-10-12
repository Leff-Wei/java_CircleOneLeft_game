public class CircleOneLeftChainedList {
	public static void main (String[] args) {
		int playerNum = Integer.parseInt(args[0]); // suppose there are 500 kids in a circle
		int play[] = new int[playerNum]; 
		// we would build a Chained list
		
		for (int i = 0; i < playerNum; i++){
			if (i == playerNum - 1)
				play[i] = 0;
			else
				play[i] = i + 1;
		}
		
		// System.out.println ("Chained list was created for " + playerNum + " players.");
		
		// use Chained list to get the final kid in the circle
		int last = 0, playerCount = 0, count = 0, remanent = playerNum;
		
		while (remanent > 1){
			count ++;
			if (count == 3){
				// System.out.println (">>>Into delete>>>>>>>>");
				count = 0;
				remanent --;
				// System.out.println (">>>remanent: " + remanent);
				play[last] = play[playerCount];
				// System.out.println (">>>last: " + last);
				// System.out.println (">>>play[last]: " + play[last]);
				playerCount = play[playerCount];
				// System.out.println (">>>playerCount: " + playerCount);
				// System.out.println (">>>play[playerCount]: " + play[playerCount]);
				// System.out.println ("<<<OUT delete\n<<<<<<<<<<<");
				continue;
			}
			last = playerCount;
			playerCount = play[playerCount];
			// System.out.println (">>>last: " + last);
			// System.out.println (">>>play[last]: " + play[last]);
			// System.out.println (">>>playerCount: " + playerCount);
			// System.out.println (">>>play[playerCount]: " + play[playerCount]);
		}
		
		//print the final one id.
		System.out.println ("The No. " + last + " was the winner.");		
	}
}