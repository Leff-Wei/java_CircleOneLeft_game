public class CircleOneLeft{
	public static void main(String[] args){
		if(args.length==0) 
			printGameIntro();
		
		boolean totalNum[] = new boolean[Integer.parseInt(args[0])];
		int playerNum = Integer.parseInt(args[1]);
		
		if(Integer.parseInt(args[0]) < Integer.parseInt(args[1])){
			System.out.println("Wrong Input! Your place should within the first number you entered.\n");	
			System.exit(-1);
		}
		
		if(Integer.parseInt(args[1]) < 1){
			System.out.println("Wrong Input! Your place should at least the fist one. i.e. 1 follows after 10 or other integer.\n");	
			System.exit(-1);
		}
		
		for (int h = 0; h < totalNum.length; h++) {
			totalNum[h] = true;	
		}
	
		System.out.println("Game Start: " + totalNum.length + " player(s) in total.\n");			
				
		int i = 0, killer_3s = 0, outNumber = 0, round = 0; 
		
		while (i < totalNum.length) {
			// System.out.println("<<<In while, i = " + i);			
			if (totalNum[i]){
				if (++killer_3s % 3 == 0){
					System.out.print("<<<<<<No. " + i);			
					System.out.print(" is out now, time: " + killer_3s +". ");			
					totalNum[i] = false;
					outNumber++;
					System.out.println( outNumber + " people out now!");			
				}
			}	
			
			if (outNumber+1 == totalNum.length) {
				System.out.println("\n<<<<<<< Finish play! >>>>>>>\n");			
				break;
			}
			if (++i == totalNum.length) {
				i = 0; 
				round++;
				System.out.println(">>>>>>>>>>Next round...\n");			
			}
			// System.out.println("<<<Out while, i = " + i + "\n");		
		}
				
		for (int m = 0; m < totalNum.length; m++) {			
			
			if (totalNum[m] == true && m == playerNum-1) 
				System.out.println("Congrats! You win after " + round + " rounds.");
			if (totalNum[m] == true && m != playerNum-1) 
				System.out.println("After " + round + " rounds. Player No. " + (m+1) + " wins!");
		}
		System.out.println("\n***********************\n*******Game Over*******\n***********************");
	}
	
	public static void printGameIntro(){
		System.out.println("Please enter TWO INTEGERs after the command \"java CircleOneLeft\", i.e. java CircleOneLeft 4 0 -> Enter. \n\nThe first integer presents how many ppl in the game standing in a circle, and each one count 1-2-3, 1-2-3, ... in turn. \n\n And when the \"3\" hits the third person, that one out. \n\nAgain, go on counting from the fourth person, then the sixth one out, and so forth. \n\nIf the counting goes beyond the player numvers, then because it is a circle, we can treat the first one as the next one. (And this breaks another round.)\n\nPlay the game till there is only one person left. \n\n* And the most important thing, the SECOND integer is your place which can NOT be larger than the total number of players.\n\n");	
		System.exit(-1);
	
	}
}

