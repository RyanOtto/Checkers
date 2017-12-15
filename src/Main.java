import java.util.*;

public class Main {

	public static void main(String[] args) {
		boolean playing = true;
		int currentPlayer = 1;
		
		while(playing) {
			int[][] spaces = { {0,0,0,0,0,0,0,0}, 
			                   {0,0,0,0,0,0,0,0}, 
			                   {0,0,0,0,0,0,0,0},
			                   {0,0,0,0,0,0,0,0}, 
			                   {0,0,0,0,0,0,0,0}, 
			                   {0,0,0,0,0,0,0,0}, 
			                   {0,0,0,0,0,0,0,0}, 
			                   {0,0,0,0,0,0,0,0} };
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a series of coordinates of the piece you want to move (I.E. B,1), a space, and the coordinates where you want to move it (I.E. C,3)");
			String playerChoiceInput = scan.nextLine();
			String[] playerChoices = playerChoiceInput.split(" ");
			char originLetter = playerChoices[0].charAt(0);
			char destinationLetter = playerChoices[1].charAt(0);
	
			int originRowNumber = 0;
			int destinationRowNumber = 0;
			
			switch(Character.toLowerCase(originLetter)) {
				case 'a':
					originRowNumber = 0;
					break;
				case 'b':
					originRowNumber = 1;
					break;
				case 'c':
					originRowNumber = 2;
					break;
				case 'd':
					originRowNumber = 3;
					break;
				case 'e':
					originRowNumber = 4;
					break;
				case 'f':
					originRowNumber = 5;
					break;
				case 'g':
					originRowNumber = 6;
					break;
				case 'h':
					originRowNumber = 7;
					break;
			}
			switch(Character.toLowerCase(destinationLetter)) {
				case 'a':
					destinationRowNumber = 0;
					break;
				case 'b':
					destinationRowNumber = 1;
					break;
				case 'c':
					destinationRowNumber = 2;
					break;
				case 'd':
					destinationRowNumber = 3;
					break;
				case 'e':
					destinationRowNumber = 4;
					break;
				case 'f':
					destinationRowNumber = 5;
					break;
				case 'g':
					destinationRowNumber = 6;
					break;
				case 'h':
					destinationRowNumber = 7;
			}
			
			int originColumnNumber = Integer.parseInt(playerChoices[0].substring(2, 3));
			int destinationColumnNumber = Integer.parseInt(playerChoices[1].substring(2, 3));
			System.out.println( originRowNumber + " " + originColumnNumber + " " + destinationRowNumber + " " + destinationColumnNumber );
			
//			if( originLetter ==  )
			
		}
		
		
	}
}
